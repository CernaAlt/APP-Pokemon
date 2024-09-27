package com.app.s7_pokemones.services;

import com.app.s7_pokemones.Entidades.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPokemon {

    // Obtener todos los pokémon
    @GET("pokemon")
    Call<List<Pokemon>> getPokemons();

    // Obtener un pokémon por id
    @GET("pokemon/{id}")
    Call<Pokemon> getPokemonById(@Path("id") int id);
}
