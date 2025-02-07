package com.example.gymtracker.shared.domain

import com.example.gymtracker.historic.presentation.navigation.historicScreenRoute
import com.example.gymtracker.progress.presentation.navigation.progressScreenRoute
import com.example.gymtracker.trainingdetail.presentation.navigation.trainingDetailScreenRoute
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreenRoute
import kotlinx.serialization.Serializable

@Serializable
sealed class ScreenRoute(
    val route: String,
    val title: String,
) {
    @Serializable
    data object TrainingListScreenRoute : ScreenRoute(trainingListScreenRoute, "Training List")
    @Serializable
    data object HistoricScreenRoute : ScreenRoute(historicScreenRoute, "Historic")
    @Serializable
    data object ProgressScreenRoute : ScreenRoute(progressScreenRoute, "Progress")
    @Serializable
    data class TrainingDetailScreenRoute(val trainingDayId: String) : ScreenRoute(trainingDetailScreenRoute, "Training Detail")
}