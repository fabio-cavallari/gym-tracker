package com.example.gymtracker.trainingdetail.presentation

import androidx.lifecycle.ViewModel
import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.trainingdetail.presentation.intent.TrainingDetailIntent
import com.example.gymtracker.trainingdetail.presentation.state.TrainingDetailUiState
import com.example.gymtracker.utils.trainingListSample
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TrainingDetailViewModel @Inject constructor(): ViewModel() {
    private var trainingId: String = ""

    private val _state: MutableStateFlow<TrainingDetailUiState> =
        MutableStateFlow(TrainingDetailUiState(UiState.Success) )
    val state: StateFlow<TrainingDetailUiState> = _state

    fun setTrainingId(id: String) {
        trainingId = id
        val trainingDay = trainingListSample.first { trainingDay ->
            trainingDay.id == trainingId
        }
        _state.value = TrainingDetailUiState(UiState.Success, trainingDay)
    }

    private fun skipExercise(index: Int) {
        val trainingDay = state.value.trainingDay
        val updatedExercises = trainingDay.exercises.toMutableList().apply {
            this[index] = this[index].copy(skipped = true, isOptionsRevealed = false)
        }
        val updatedTrainingDay = trainingDay.copy(
            exercises = updatedExercises
        )
        _state.value = TrainingDetailUiState(UiState.Success, updatedTrainingDay)
    }

    fun onIntent(intent: TrainingDetailIntent) {
        when (intent) {
            is TrainingDetailIntent.SkipTrainingExercise -> skipExercise(intent.index)
        }
    }
}