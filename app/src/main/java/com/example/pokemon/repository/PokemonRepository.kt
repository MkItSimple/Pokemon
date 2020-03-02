package com.example.pokemon.repository

import com.example.pokemon.LIMIT
import com.example.pokemon.data.PokemonDetails
import com.example.pokemon.data.PokemonResponse
import com.example.pokemon.network.PokemonApi
import io.reactivex.Observable

class PokemonRepository (val pokemonApi: PokemonApi){

    fun getPokemonList(offset:Int): Observable<PokemonResponse>{
        return  pokemonApi.getPokemonList(offset , LIMIT)
    }

    fun getPokemonDetails(id:Int):Observable<PokemonDetails>{
        return pokemonApi.getPokemonDetails(id)
    }

}