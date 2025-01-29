package com.example.gymtracker.traininglist.presentation.state

import com.example.gymtracker.traininglist.domain.TrainingDay

enum class TrainingListState {
    SUCCESS, LOADING, ERROR, EMPTY
}

data class TrainingListUiState(
    val uiState: TrainingListState = TrainingListState.LOADING,
    val trainings: List<TrainingDay> = listOf(),
)