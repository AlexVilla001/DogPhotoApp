package com.mexiti.catphotoapp.model

import kotlinx.serialization.Serializable

@Serializable
data class DogModel(
    val image_link: String,
    val good_with_children:Int,
    val good_with_other_dogs: Int,
    val name: String
)
