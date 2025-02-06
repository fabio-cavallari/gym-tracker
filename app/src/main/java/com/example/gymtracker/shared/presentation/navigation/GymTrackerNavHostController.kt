package com.example.gymtracker.shared.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.gymtracker.historic.presentation.navigation.historicScreen
import com.example.gymtracker.progress.presentation.navigation.progressScreen
import com.example.gymtracker.trainingdetail.presentation.navigation.trainingDetailScreen
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreen
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreenRoute

@Composable
fun GymTrackerNavHostController(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = trainingListScreenRoute
    ) {
        trainingListScreen(navHostController)
        historicScreen(navHostController)
        progressScreen(navHostController)
        trainingDetailScreen(navHostController)
    }
}