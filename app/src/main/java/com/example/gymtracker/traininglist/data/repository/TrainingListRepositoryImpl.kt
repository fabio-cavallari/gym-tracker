package com.example.gymtracker.traininglist.data.repository

import com.example.gymtracker.traininglist.domain.TrainingDay
import com.example.gymtracker.utils.Result
import com.example.gymtracker.utils.trainingListSample

class TrainingListRepositoryImpl: TrainingListRepository {
    override fun getTrainingList(): Result<List<TrainingDay>> {
        return Result.Success(trainingListSample)
    }
}