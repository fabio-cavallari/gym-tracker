package com.example.gymtracker.trainingdetail.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.gymtracker.shared.domain.ScreenRoute.TrainingDetailScreenRoute
import com.example.gymtracker.trainingdetail.presentation.screen.TrainingDetailScreen

internal const val trainingDetailScreenRoute = "trainingDetail"

fun NavGraphBuilder.trainingDetailScreen(
    navController: NavController
) {
    composable<TrainingDetailScreenRoute> {
        val trainingDetailRoute = it.toRoute<TrainingDetailScreenRoute>()
        TrainingDetailScreen(
            navController = navController,
            trainingDayId = trainingDetailRoute.trainingDayId,
        )
    }
}