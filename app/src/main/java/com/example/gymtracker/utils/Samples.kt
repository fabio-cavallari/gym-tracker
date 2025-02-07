package com.example.gymtracker.utils

import com.example.gymtracker.traininglist.domain.AdditionalTechnic
import com.example.gymtracker.traininglist.domain.Exercise
import com.example.gymtracker.traininglist.domain.MuscleGroup
import com.example.gymtracker.traininglist.domain.TrainingDay

val exerciseChestASample = Exercise(
    name = "exercise 1",
    sets = 3,
    reps = 10,
    load = 10.0,
    additionalTechnic = null,
    muscleGroup = MuscleGroup.CHEST
)

val exerciseChestBSample = Exercise(
    name = "exercise 2",
    sets = 4,
    reps = 10,
    load = 10.0,
    additionalTechnic = AdditionalTechnic.DROP_SET,
    muscleGroup = MuscleGroup.CHEST
)

val exerciseBackASample = Exercise(
    name = "exercise 1",
    sets = 3,
    reps = 10,
    load = 10.0,
    additionalTechnic = null,
    muscleGroup = MuscleGroup.BACK
)

val exerciseBackBSample = Exercise(
    name = "exercise 2",
    sets = 3,
    reps = 10,
    load = 10.0,
    additionalTechnic = AdditionalTechnic.REST_AND_PAUSE,
    muscleGroup = MuscleGroup.BACK
)

val trainingDayChestSample = TrainingDay(
    id = "1",
    name = "chest day",
    exercises = listOf(exerciseChestASample, exerciseChestBSample)
)

val trainingBackSample = TrainingDay(
    id = "2",
    name = "back day",
    exercises = listOf(exerciseBackASample, exerciseBackBSample)
)