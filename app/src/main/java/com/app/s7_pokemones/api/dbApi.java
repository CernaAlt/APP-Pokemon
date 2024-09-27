package com.app.s7_pokemones.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class dbApi {
    private static Retrofit retrofit = null;
    private static final String BASE_URL = "https://mockapi.io/projects/tu_project_id/";

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
