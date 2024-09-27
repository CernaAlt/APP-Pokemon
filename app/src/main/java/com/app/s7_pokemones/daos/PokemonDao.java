package com.app.s7_pokemones.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.app.s7_pokemones.Entidades.Pokemon;

import java.util.List;

@Dao
public interface PokemonDao {


    // Búsqueda por id
    @Query("SELECT * FROM Pokemon WHERE id = :id")
    Pokemon getById(int id);

    // Obtener todos los datos de los pokemones
    @Query("SELECT * FROM Pokemon")
    List<Pokemon> getAll();

    // Insertar un nuevo pokemon
    @Insert
    void insert(Pokemon pokemon);

    // Insertar una lista de pokemones
    @Insert
    void insertAll(List<Pokemon> pokemones);

    // Actualizar un pokemon existente
    @Update
    void update(Pokemon pokemon);



    // Eliminar un pokemon por su id
    @Query("DELETE FROM Pokemon WHERE id = :id")
    void deleteById(int id);



    // Eliminar un pokemon por su objeto
    //@Delete
    //void delete(Pokemon pokemon);
}
