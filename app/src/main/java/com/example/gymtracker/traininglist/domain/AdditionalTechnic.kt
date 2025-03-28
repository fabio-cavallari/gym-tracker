package com.example.gymtracker.traininglist.domain

import kotlinx.serialization.Serializable

@Serializable
sealed class AdditionalTechnic (val name: String) {
    data object DropSet : AdditionalTechnic("drop set")
    data object RestAndPause : AdditionalTechnic("rest and pause")
}

