package com.example.gymtracker.trainingdetail.presentation.intent

sealed class TrainingDetailIntent {
    data class SkipTrainingExercise(val index: Int): TrainingDetailIntent()
}