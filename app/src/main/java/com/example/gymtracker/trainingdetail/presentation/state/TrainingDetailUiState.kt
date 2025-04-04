package com.example.gymtracker.trainingdetail.presentation.state

import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.traininglist.domain.TrainingDay

data class TrainingDetailUiState(
    val uiState: UiState,
    var trainingDay: TrainingDay = TrainingDay(id = "", name = "", exercises = listOf()),
)