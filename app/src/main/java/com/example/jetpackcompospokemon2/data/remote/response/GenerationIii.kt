package com.example.jetpackcompospokemon2.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireredleafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubysapphire: RubySapphire
)