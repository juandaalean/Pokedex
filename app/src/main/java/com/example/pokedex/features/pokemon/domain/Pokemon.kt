package com.example.pokedex.features.pokemon.domain

data class Pokemon(
    val name: String,
    val pokedexNumber: Int, //id
    val sprites: Sprites,
    val stats: List<Stats>,
    val types: List<Types>,
    val height: Float,
    val weight: Float
)

data class Sprites(
    val frontDefault: String?, //
    val frontShiny: String?, //
    val versions: Versions
)

data class Versions(
    val generationV: GenerationV? //
)

data class GenerationV(
    val blackWhite: BlackWhite? //
)

data class BlackWhite(
    val animated: Animated?
)

data class Animated(
    val frontDefault: String?, //
    val backDefault: String? //
)

data class Types(
    val type: TypeDetails
)

data class TypeDetails(
    val typeName: String, //type
    val url: String
)

data class Stats(
    val stat: StatDetails,
    val baseStat: Int
)

data class StatDetails(
    val name: String,
    val url: String
)
