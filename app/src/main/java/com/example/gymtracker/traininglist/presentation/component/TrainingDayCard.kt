package com.example.gymtracker.traininglist.presentation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme
import com.example.gymtracker.shared.presentation.theme.Typography
import com.example.gymtracker.traininglist.domain.TrainingDay
import com.example.gymtracker.utils.trainingDayChestSample

@Composable
fun TrainingDayCard(
    modifier: Modifier = Modifier,
    trainingDay: TrainingDay,
    onTrainingDayClick: (TrainingDay) -> Unit = {},
) {
    Card(
        modifier
            .fillMaxWidth()
            .clickable { onTrainingDayClick(trainingDay) },
        elevation = CardDefaults.cardElevation(0.dp),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
    ) {
        Column(Modifier.padding(16.dp)) {
            Spacer(Modifier.height(30.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = trainingDay.name,
                    style = Typography.titleLarge,
                )
            }
            HorizontalDivider(
                color = MaterialTheme.colorScheme.onSurface
            )

        }
    }
}

@Preview
@Composable
private fun TrainingDayCardPrev() {
    AppTheme(darkTheme = true) {
        TrainingDayCard(trainingDay = trainingDayChestSample)
    }
}