package com.example.pokedex.features.pokemon.domain

interface PokemonRepository {
    fun getPokemons(): List<Pokemon>
}