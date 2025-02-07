package com.example.gymtracker.shared.presentation.state

sealed class UiState {
    data object Loading: UiState()
    data object Success: UiState()
    data object Error: UiState()
}