package com.example.jetpackcompospokemon2.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.jetpackcompospokemon2.Repository.PokemonRepository
import com.example.jetpackcompospokemon2.data.remote.response.Pokemon
import com.example.jetpackcompospokemon2.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel(){

    suspend fun getPokemonInfo(pokemonName : String) : Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}