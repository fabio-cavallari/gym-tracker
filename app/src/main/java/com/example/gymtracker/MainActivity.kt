@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.gymtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.compose.AppTheme
import com.example.gymtracker.shared.domain.ScreenRoute
import com.example.gymtracker.shared.presentation.navigation.GymTrackerNavHostController
import com.example.gymtracker.shared.presentation.theme.Typography
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme(true) {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = stringResource(R.string.app_name),
                                    style = Typography.headlineLarge,
                                )
                            },
                            navigationIcon = {
                                val navBackStackEntry by navController.currentBackStackEntryAsState()
                                val currentDestination = navBackStackEntry?.destination
                                val isInNestedNavigation = !currentDestination?.route.equals(
                                    ScreenRoute.TrainingListScreenRoute::class.qualifiedName
                                        ?: ""
                                ) && !currentDestination?.route.equals(
                                    ScreenRoute.HistoricScreenRoute::class.qualifiedName
                                        ?: ""
                                ) && !currentDestination?.route.equals(
                                    ScreenRoute.ProgressScreenRoute::class.qualifiedName
                                        ?: ""
                                )
                                if (isInNestedNavigation) {
                                    IconButton(onClick = { navController.popBackStack() }) {
                                        Icon(
                                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                            contentDescription = "navigationBack"
                                        )
                                    }
                                }

                            }
                        )
                    },
                    bottomBar = {
                        BottomNavigationBar(navController)
                    }
                ) { innerPadding ->
                    Box(Modifier.padding(innerPadding)) {
                        GymTrackerNavHostController(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        Pair(ScreenRoute.TrainingListScreenTabRoute, Icons.Default.Menu),
        Pair(ScreenRoute.HistoricScreenTabRoute, Icons.Default.DateRange),
        Pair(ScreenRoute.ProgressScreenTabRoute, Icons.Default.Star)
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        items.forEach { screenTab ->
            val itemRoute = screenTab.first::class.qualifiedName
            val isSelected = currentDestination?.hierarchy?.any {
                it.route == itemRoute
            } == true
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = screenTab.second,
                        contentDescription = screenTab.first.title,
                    )
                },
                colors = NavigationBarItemColors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    selectedIndicatorColor = Color.Transparent,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurface,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurface,
                    disabledIconColor = MaterialTheme.colorScheme.onSurface,
                    disabledTextColor = MaterialTheme.colorScheme.onSurface,
                ),
                label = { Text(screenTab.first.title) },
                selected = isSelected,
                onClick = {
                    if (isSelected) {
                        navController.navigate(screenTab.first) {
                            popUpTo(navController.graph.findStartDestination().id)
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(screenTab.first) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
            )
        }
    }
}