package com.example.gymtracker.progress.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.gymtracker.progress.presentation.screen.ProgressScreen
import com.example.gymtracker.shared.domain.ScreenRoute

internal const val progressScreenRoute = "progress"

fun NavGraphBuilder.progressScreen(
    navController: NavController
) {
    composable<ScreenRoute.ProgressScreenRoute> {
        ProgressScreen(navController = navController)
    }
}