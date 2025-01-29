package com.example.gymtracker.traininglist.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gymtracker.traininglist.presentation.state.TrainingListUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TrainingListViewModel: ViewModel() {
    private val _state: MutableStateFlow<TrainingListUiState> =
        MutableStateFlow(TrainingListUiState())
    val state: StateFlow<TrainingListUiState> = _state

}