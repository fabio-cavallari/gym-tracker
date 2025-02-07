package com.example.gymtracker.traininglist.presentation.state

import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.traininglist.domain.TrainingDay

data class TrainingListUiState(
    val uiState: UiState = UiState.Loading,
    val trainings: List<TrainingDay> = listOf(),
)