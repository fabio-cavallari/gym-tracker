package com.example.gymtracker.progress.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.gymtracker.shared.presentation.theme.Typography

@Composable
fun ProgressScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text("Progress", style = Typography.titleLarge)
    }
}