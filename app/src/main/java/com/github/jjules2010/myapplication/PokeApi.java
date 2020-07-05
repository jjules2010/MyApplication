package com.github.jjules2010.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeApi {
    @GET("/api/v2/pokemon-color/")
    Call<RestPokemonResponse> getPokemonResponse();
}
