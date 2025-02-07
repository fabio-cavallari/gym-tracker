package com.example.gymtracker.historic.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.gymtracker.historic.presentation.screen.HistoricScreen
import com.example.gymtracker.shared.domain.ScreenRoute

internal const val historicScreenRoute = "historic"

fun NavGraphBuilder.historicScreen(
    navController: NavController
) {
    composable<ScreenRoute.HistoricScreenRoute> {
        HistoricScreen(navController = navController)
    }
}