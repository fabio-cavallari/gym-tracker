package com.example.gymtracker.traininglist.domain

data class TrainingDay(
    val name: String,
    val exercises: List<Exercise>,
)