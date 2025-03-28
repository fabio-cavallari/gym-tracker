package com.example.gymtracker.trainingdetail.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gymtracker.shared.presentation.theme.Typography
import com.example.gymtracker.traininglist.domain.Exercise
import com.example.gymtracker.utils.exerciseChestASample

@Composable
fun ExerciseCard(modifier: Modifier = Modifier, exercise: Exercise) {
    Card(
        modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(0.dp),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
    ) {
        Column(
            Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = exercise.name,
                style = Typography.headlineSmall,
            )
            Spacer(Modifier.height(15.dp))
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
                    style = Typography.bodyMedium,
                )
                Icon(
                    imageVector = Icons.Filled.Refresh,
                    contentDescription = "setsCount"
                )
                Spacer(Modifier.width(30.dp))
                Text(
                    text = exercise.sets.toString(),
                    modifier = Modifier.padding(end = 4.dp),
                    style = Typography.bodyMedium
                )
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.DirectionsRun,
                    contentDescription = "repsCount"
                )
                Spacer(Modifier.width(30.dp))
                Text(
                    text = exercise.load.toString(),
                    modifier = Modifier.padding(end = 4.dp),
                    style = Typography.bodyMedium
                )
                Icon(
                    imageVector = Icons.Filled.FitnessCenter,
                    contentDescription = "load"
                )


            }

        }
    }
}

@Preview
@Composable
fun ExerciseCardPrev() {
    ExerciseCard(exercise = exerciseChestASample)
}