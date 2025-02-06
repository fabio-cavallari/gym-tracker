package com.example.gymtracker.shared.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.gymtracker.historic.presentation.navigation.historicScreenRoute
import com.example.gymtracker.progress.presentation.navigation.progressScreenRoute
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreenRoute

sealed class ScreenTab(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object TrainingList : ScreenTab(trainingListScreenRoute, "Training List", Icons.Default.Menu)
    data object Historic : ScreenTab(historicScreenRoute, "Historic", Icons.Default.DateRange)
    data object Progress : ScreenTab(progressScreenRoute, "Progress", Icons.Default.Star)
}