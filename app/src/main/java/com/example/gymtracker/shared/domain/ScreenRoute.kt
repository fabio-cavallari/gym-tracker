package com.example.gymtracker.shared.domain

import kotlinx.serialization.Serializable

@Serializable
sealed class ScreenRoute(
    val title: String,
) {
    @Serializable
    data object TrainingListScreenTabRoute : ScreenRoute("Training List")
    @Serializable
    data object TrainingListScreenRoute : ScreenRoute("Training List")
    @Serializable
    data class TrainingDetailScreenRoute(val trainingDayId: String) : ScreenRoute("Training Detail")

    @Serializable
    data object HistoricScreenTabRoute : ScreenRoute("Historic")
    @Serializable
    data object HistoricScreenRoute : ScreenRoute("Historic")

    @Serializable
    data object ProgressScreenTabRoute : ScreenRoute("Progress")
    @Serializable
    data object ProgressScreenRoute : ScreenRoute("Progress")
}