package com.example.gymtracker.traininglist.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.traininglist.data.repository.TrainingListRepository
import com.example.gymtracker.traininglist.presentation.state.TrainingListUiState
import com.example.gymtracker.utils.trainingListSample
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TrainingListViewModel @Inject constructor(
    private val repository: TrainingListRepository
) : ViewModel() {
    private val _state: MutableStateFlow<TrainingListUiState> =
        MutableStateFlow(TrainingListUiState())
    val state: StateFlow<TrainingListUiState> = _state

    init {
        loadTrainings()
    }

    private fun loadTrainings() {
        viewModelScope.launch {
            _state.value = _state.value.copy(uiState = UiState.Loading)
            delay(2000)
            val trainingList = trainingListSample
            _state.value =
                TrainingListUiState(uiState = UiState.Success, trainings = trainingList)
        }
    }

}