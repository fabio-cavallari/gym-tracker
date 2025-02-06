package com.example.gymtracker.traininglist.domain

import kotlinx.serialization.Serializable

@Serializable
data class TrainingDay(
    val name: String,
    val exercises: List<Exercise>,
)