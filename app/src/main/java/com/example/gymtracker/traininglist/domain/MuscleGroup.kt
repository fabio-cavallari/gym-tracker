package com.example.gymtracker.traininglist.domain

import kotlinx.serialization.Serializable

@Serializable
enum class MuscleGroup {
    CHEST, SHOULDERS, BACK, BICEPS, TRICEPS, LEGS_QUADRICEPS, LEGS_POSTERIOR, ABDOMINAL, CALVES, GLUTS,
}