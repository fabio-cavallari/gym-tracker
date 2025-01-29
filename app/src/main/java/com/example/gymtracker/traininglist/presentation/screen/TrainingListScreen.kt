package com.example.gymtracker.traininglist.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.gymtracker.traininglist.presentation.state.TrainingListState
import com.example.gymtracker.traininglist.presentation.state.TrainingListUiState
import com.example.gymtracker.traininglist.presentation.viewmodel.TrainingListViewModel

@Composable
fun TrainingListScreen() {
    val viewModel: TrainingListViewModel = viewModel()
    val state by viewModel.state.collectAsState()
    TrainingListScreen(state)
}

@Composable
fun TrainingListScreen(state: TrainingListUiState) {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "TrainingListScreen")
    }
}