package com.felix.todo.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.felix.todo.Business.Categorie;

import java.util.List;

// interface to say "you have to implement this" to generated classes with Room auto-generator
@Dao
public interface CategorieDao {

    /**
     * import all object from database
     * @return a List of Categorie
     */
    @Query("SELECT * FROM Categorie_table")
    List<Categorie> getAll();

    @Query("SELECT * FROM Categorie_table " +
            "WHERE \"cid\" == :cid")
    Categorie getByCId(long cid);

    @Insert
    boolean insert(Categorie categ);
    @Insert
    boolean insertAll(Categorie... categs);
    @Delete
    boolean delete(long cid);




}
