package com.app.s7_pokemones;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.app.s7_pokemones.Entidades.Pokemon;
import com.app.s7_pokemones.daos.PokemonDao;

@Database(entities = {Pokemon.class},version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public  abstract PokemonDao pokemonDao();

    private  static  AppDatabase dbIntance;


    //metodo para retonar la instancia de base de datos
    public  static AppDatabase getInstance(Context context){
        if (dbIntance==null){
            dbIntance= Room.databaseBuilder(context, AppDatabase.class ,"Database-name")
                    .allowMainThreadQueries()
                    .build();
        }
        return dbIntance;
    }
}
