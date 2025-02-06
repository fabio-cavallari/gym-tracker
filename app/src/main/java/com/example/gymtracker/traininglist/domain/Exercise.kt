package com.example.gymtracker.traininglist.domain

import kotlinx.serialization.Serializable

@Serializable
data class Exercise(
    val name: String,
    val sets: Int,
    val reps: Int,
    val load: Double,
    val additionalTechnic: AdditionalTechnic?,
    val muscleGroup: MuscleGroup
)
