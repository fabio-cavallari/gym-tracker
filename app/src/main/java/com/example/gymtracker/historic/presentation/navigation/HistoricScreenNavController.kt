package com.example.gymtracker.historic.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.gymtracker.historic.presentation.screen.HistoricScreen

internal const val historicScreenRoute = "historic"

fun NavGraphBuilder.historicScreen(
    navController: NavController
) {
    composable(
        route = historicScreenRoute
    ) {
        HistoricScreen(navController = navController)
    }
}