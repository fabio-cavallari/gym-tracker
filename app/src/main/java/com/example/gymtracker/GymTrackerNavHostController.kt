package com.example.gymtracker

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreen
import com.example.gymtracker.traininglist.presentation.navigation.trainingListScreenRoute

@Composable
fun GymTrackerNavHostController(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = trainingListScreenRoute
    ) {
        trainingListScreen(navHostController)
    }
}