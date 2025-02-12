package com.example.gymtracker.traininglist.di

import com.example.gymtracker.traininglist.data.repository.TrainingListRepository
import com.example.gymtracker.traininglist.data.repository.TrainingListRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TrainingListDependencyInjection {

    @Provides
    @Singleton
    fun provideTrainingListRepository(): TrainingListRepository {
        return TrainingListRepositoryImpl()
    }
}