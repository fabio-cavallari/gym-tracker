package com.example.gymtracker.traininglist.presentation.state

enum class TrainingListState {
    SUCCESS, LOADING, ERROR, EMPTY
}

data class TrainingListUiState(
    val uiState: TrainingListState = TrainingListState.LOADING,
    val trainings: List<String> = listOf(),
)