package com.example.gymtracker.trainingdetail.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gymtracker.shared.presentation.theme.DEFAULT_SPACING
import com.example.gymtracker.shared.presentation.theme.Typography
import com.example.gymtracker.shared.presentation.theme.onSecondaryDark
import com.example.gymtracker.shared.presentation.theme.secondaryDark
import com.example.gymtracker.traininglist.domain.Exercise
import com.example.gymtracker.utils.exerciseChestBSample

@Composable
fun ExerciseCard(modifier: Modifier = Modifier, exercise: Exercise) {
    Card(
        modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(0.dp),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
    ) {
        val overlayModifier = if (exercise.skipped) {
            Modifier.background(Color.White.copy(alpha = 0.2f))
        } else {
            Modifier
        }
        Box(
            modifier = overlayModifier
        ) {
            Column(
                Modifier.padding(16.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Row {
                    Text(
                        text = exercise.name,
                        style = Typography.titleMedium,
                    )
                    Spacer(Modifier.weight(1f))
                    if (exercise.skipped) {
                        Row(
                            modifier = Modifier
                                .background(
                                    color = secondaryDark,
                                    shape = RoundedCornerShape(16.dp),
                                )
                                .padding(horizontal = 8.dp)
                                .clickable {

                                },
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier.size(16.dp),
                                imageVector = Icons.Default.Close,
                                contentDescription = "removeSkipped",
                                tint = onSecondaryDark,
                            )
                            Text(
                                "skipped",
                                style = Typography.labelLarge,
                                color = onSecondaryDark,
                            )
                        }
                    }
                }
                Spacer(Modifier.height(20.dp))
                HorizontalDivider(
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(Modifier.height(15.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = exercise.sets.toString(),
                        modifier = Modifier.padding(end = 4.dp),
                        style = Typography.labelMedium,
                    )
                    Icon(
                        imageVector = Icons.Filled.Refresh,
                        contentDescription = "setsCount"
                    )
                    Spacer(Modifier.width(DEFAULT_SPACING))
                    Text(
                        text = exercise.sets.toString(),
                        modifier = Modifier.padding(end = 4.dp),
                        style = Typography.labelMedium
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.DirectionsRun,
                        contentDescription = "repsCount"
                    )
                    Spacer(Modifier.width(DEFAULT_SPACING))
                    Text(
                        text = exercise.load.toString(),
                        modifier = Modifier.padding(end = 4.dp),
                        style = Typography.labelMedium
                    )
                    Icon(
                        imageVector = Icons.Filled.FitnessCenter,
                        contentDescription = "load"
                    )
                    Spacer(Modifier.weight(1f))
                    exercise.additionalTechnic?.let {
                        Text(
                            it.name,
                            modifier = Modifier
                                .background(
                                    color = secondaryDark,
                                    shape = RoundedCornerShape(16.dp),
                                )
                                .padding(horizontal = 8.dp),
                            style = Typography.labelLarge,
                            color = onSecondaryDark
                        )
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun ExerciseCardPrev() {
    ExerciseCard(exercise = exerciseChestBSample)
}

@Preview
@Composable
fun ExerciseCardSkippedPrev() {
    ExerciseCard(exercise = exerciseChestBSample.copy(skipped = true))
}