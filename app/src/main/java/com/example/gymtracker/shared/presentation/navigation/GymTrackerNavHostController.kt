package com.example.gymtracker.shared.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import com.example.gymtracker.historic.presentation.navigation.historicScreen
import com.example.gymtracker.progress.presentation.navigation.progressScreen
import com.example.gymtracker.shared.domain.ScreenRoute
import com.example.gymtracker.trainingdetail.presentation.navigation.trainingDetailScreen
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreen

@Composable
fun GymTrackerNavHostController(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = ScreenRoute.TrainingListScreenTabRoute
    ) {
        navigation<ScreenRoute.TrainingListScreenTabRoute>(
            startDestination = ScreenRoute.TrainingListScreenRoute
        ) {
            trainingListScreen(navHostController)
            trainingDetailScreen(navHostController)
        }
        navigation<ScreenRoute.HistoricScreenTabRoute>(
            startDestination = ScreenRoute.HistoricScreenRoute
        ) {
            historicScreen(navHostController)
        }
        navigation<ScreenRoute.ProgressScreenTabRoute>(
            startDestination = ScreenRoute.ProgressScreenRoute
        ) {
            progressScreen(navHostController)
        }

    }
}