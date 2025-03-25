package com.example.gymtracker.trainingdetail.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.shared.presentation.theme.Typography
import com.example.gymtracker.trainingdetail.presentation.state.TrainingDetailUiState
import com.example.gymtracker.utils.trainingListSample

@Composable
fun TrainingDetailScreen(navController: NavController, trainingDayId: String) {
    val trainingDay = trainingListSample.first { trainingDay ->
        trainingDay.id == trainingDayId
    }
    TrainingDetailScreen(uiState = TrainingDetailUiState(UiState.Success, trainingDay))
}

@Composable
fun TrainingDetailScreen(modifier: Modifier = Modifier, uiState: TrainingDetailUiState) {
    Column (
        modifier.fillMaxSize()
            .padding(20.dp),
    ) {

        Text(uiState.trainingDay.name, style = Typography.titleLarge)
        LazyColumn {
            items(
                items = uiState.trainingDay.exercises,
                key = { it.hashCode() }
            ) {

            }
        }
    }
}