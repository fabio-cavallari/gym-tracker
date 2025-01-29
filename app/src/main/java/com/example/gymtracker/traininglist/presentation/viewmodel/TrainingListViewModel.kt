package com.example.gymtracker.traininglist.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gymtracker.traininglist.presentation.state.TrainingListState
import com.example.gymtracker.traininglist.presentation.state.TrainingListUiState
import com.example.gymtracker.utils.trainingBackSample
import com.example.gymtracker.utils.trainingDayChestSample
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TrainingListViewModel : ViewModel() {
    private val _state: MutableStateFlow<TrainingListUiState> =
        MutableStateFlow(TrainingListUiState())
    val state: StateFlow<TrainingListUiState> = _state

    init {
        loadTrainings()
    }

    fun loadTrainings() {
        viewModelScope.launch {
            _state.value = _state.value.copy(uiState = TrainingListState.LOADING)
            delay(2000)
            val trainingList = listOf(trainingBackSample, trainingDayChestSample)
            _state.value =
                TrainingListUiState(uiState = TrainingListState.SUCCESS, trainings = trainingList)
        }
    }

}