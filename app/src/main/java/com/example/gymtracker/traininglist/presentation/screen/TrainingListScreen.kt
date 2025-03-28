package com.example.gymtracker.traininglist.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.compose.AppTheme
import com.example.gymtracker.shared.domain.ScreenRoute
import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.shared.presentation.theme.DEFAULT_SPACING
import com.example.gymtracker.traininglist.presentation.component.TrainingDayCard
import com.example.gymtracker.traininglist.presentation.intent.TrainingListIntent
import com.example.gymtracker.traininglist.presentation.intent.TrainingListIntent.GoToTrainingDetail
import com.example.gymtracker.traininglist.presentation.state.TrainingListUiState
import com.example.gymtracker.traininglist.presentation.viewmodel.TrainingListViewModel
import com.example.gymtracker.utils.trainingBackSample
import com.example.gymtracker.utils.trainingDayChestSample

@Composable
fun TrainingListScreen(navController: NavController) {
    val viewModel: TrainingListViewModel = hiltViewModel()
    val state by viewModel.state.collectAsState()
    TrainingListScreen(state) { intent: TrainingListIntent ->
        when (intent) {
            is GoToTrainingDetail ->
                navController.navigate(
                    route = ScreenRoute.TrainingDetailScreenRoute(intent.trainingDay.id)
                )
        }
    }
}

@Composable
fun TrainingListScreen(state: TrainingListUiState, onIntent: (TrainingListIntent) -> Unit = {}) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(DEFAULT_SPACING),
    ) {
        when (state.uiState) {
            UiState.Success -> LazyColumn(
                verticalArrangement = Arrangement.spacedBy(DEFAULT_SPACING)
            ) {
                items(
                    items = state.trainings,
                    key = { it.hashCode() },
                ) { training ->
                    TrainingDayCard(
                        trainingDay = training,
                        onTrainingDayClick = {
                            onIntent(
                                GoToTrainingDetail(
                                    training
                                )
                            )
                        },
                    )
                }
            }

            else -> Box(
                Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                CircularProgressIndicator()
            }
        }
        FloatingActionButton(
            onClick = { },
            Modifier.padding(0.dp)
                .align(Alignment.BottomEnd)
        ) {
            Icon(Icons.Filled.Add, "add new training")
        }
    }
}

@Preview
@Composable
private fun TrainingListScreenSuccessPrev() {
    AppTheme(darkTheme = true) {
        Surface {
            TrainingListScreen(
                state = TrainingListUiState(
                    uiState = UiState.Success, trainings = listOf(
                        trainingBackSample,
                        trainingDayChestSample,
                    )
                )
            )
        }
    }
}