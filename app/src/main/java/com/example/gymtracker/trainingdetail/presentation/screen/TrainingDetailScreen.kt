package com.example.gymtracker.trainingdetail.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NotificationsPaused
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.gymtracker.shared.presentation.state.UiState
import com.example.gymtracker.shared.presentation.theme.DEFAULT_SPACING
import com.example.gymtracker.shared.presentation.theme.Typography
import com.example.gymtracker.shared.presentation.theme.surfaceDimDark
import com.example.gymtracker.trainingdetail.presentation.TrainingDetailViewModel
import com.example.gymtracker.trainingdetail.presentation.component.ExerciseCard
import com.example.gymtracker.trainingdetail.presentation.component.SwipeableCard
import com.example.gymtracker.trainingdetail.presentation.intent.TrainingDetailIntent
import com.example.gymtracker.trainingdetail.presentation.state.TrainingDetailUiState
import com.example.gymtracker.utils.trainingDayChestSample

@Composable
fun TrainingDetailScreen(navController: NavController, trainingDayId: String) {
    val viewModel: TrainingDetailViewModel = hiltViewModel()
    LaunchedEffect(trainingDayId) {
        viewModel.setTrainingId(trainingDayId)
    }
    val state by viewModel.state.collectAsState()
    TrainingDetailScreen(uiState = state, onIntent = viewModel::onIntent)
}

@Composable
fun TrainingDetailScreen(
    modifier: Modifier = Modifier,
    uiState: TrainingDetailUiState,
    onIntent: (TrainingDetailIntent) -> Unit = {}
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(DEFAULT_SPACING),
    ) {

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(uiState.trainingDay.name, style = Typography.titleLarge)
            Button(
                onClick = {},
                modifier = Modifier.padding(8.dp)
            ) {
                Text("check in training", style = Typography.titleMedium)
            }
        }
        Spacer(Modifier.height(DEFAULT_SPACING))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(DEFAULT_SPACING)
        ) {
            itemsIndexed(
                items = uiState.trainingDay.exercises,
                key = { _, item -> item.hashCode() }
            ) { index, exercise ->
                SwipeableCard(
                    isRevealed = exercise.isOptionsRevealed,
                    actions = {
                        Column(
                            modifier = Modifier
                                .width(60.dp)
                                .fillMaxHeight()
                                .background(color = surfaceDimDark)
                                .clickable {
                                    onIntent(TrainingDetailIntent.SkipTrainingExercise(index))
                                },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.NotificationsPaused,
                                contentDescription = "skipExercise",
                            )
                            Text("skip", style = Typography.labelMedium)
                        }
                    },
                ) {
                    ExerciseCard(exercise = exercise)
                }
            }
        }
    }
}

@Preview
@Composable
private fun TrainingDetailScreenPreview() {
    TrainingDetailScreen(uiState = TrainingDetailUiState(UiState.Success, trainingDayChestSample))
}