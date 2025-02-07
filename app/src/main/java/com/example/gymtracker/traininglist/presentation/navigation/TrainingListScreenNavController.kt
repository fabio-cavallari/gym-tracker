package com.example.gymtracker.traininglist.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.gymtracker.shared.domain.ScreenRoute
import com.example.gymtracker.traininglist.presentation.screen.TrainingListScreen

internal const val trainingListScreenRoute = "trainingList"

fun NavGraphBuilder.trainingListScreen(
    navController: NavController
) {
    composable<ScreenRoute.TrainingListScreenRoute> {
        TrainingListScreen(navController = navController)
    }
}