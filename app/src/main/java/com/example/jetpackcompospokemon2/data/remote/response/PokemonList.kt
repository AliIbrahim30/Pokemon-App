package com.example.jetpackcompospokemon2.data.remote.response

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)