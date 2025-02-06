package com.example.gymtracker.traininglist.presentation.intent

import com.example.gymtracker.traininglist.domain.TrainingDay

sealed class TrainingListIntent {
    data class GoToTrainingDetail(val trainingDay: TrainingDay): TrainingListIntent()
}