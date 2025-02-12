package com.example.gymtracker.traininglist.data.repository

import com.example.gymtracker.traininglist.domain.TrainingDay
import com.example.gymtracker.utils.Result

interface TrainingListRepository {
    fun getTrainingList(): Result<List<TrainingDay>>
}