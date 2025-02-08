package com.felix.todo.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TacheDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(TacheDao tacheDao);

    @Query("DELETE FROM tache_table")
    void deleteAll();

    @Query("SELECT * FROM tache_table ORDER BY date ASC")
    LiveData<List<TacheDao>> getTacheByDate();

}
