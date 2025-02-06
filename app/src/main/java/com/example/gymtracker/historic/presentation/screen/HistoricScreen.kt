package com.example.gymtracker.historic.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.gymtracker.shared.presentation.theme.Typography

@Composable
fun HistoricScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text("Historic", style = Typography.titleLarge)
    }
}