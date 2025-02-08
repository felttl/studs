package com.felix.todo.DAO;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.felix.todo.Business.Categorie;
import com.felix.todo.Business.Tache;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** Singleton
 * Le code suivant définit une classe AppDatabase
 * destinée à contenir la base de données. AppDatabase
 * définit la configuration de la base de données et
 * sert de point d'accès principal de l'application aux
 * données persistantes. La classe de base de données doit
 * remplir les conditions suivantes définies dans celle-ci:
 */
@Database(entities = {Tache.class, Categorie.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{

    private CategorieDao wordDao;
    private TacheDao tacheDao;

    private static volatile AppDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(AppDatabase.NUMBER_OF_THREADS);

    public static AppDatabase getDatabase(final Context context) {
        if(AppDatabase.INSTANCE == null){
            synchronized (AppDatabase.class){
                if (AppDatabase.INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        AppDatabase.class,
                    "todo_database"
                    ).build();
                }
            }
        }
        return AppDatabase.INSTANCE;
    }
}
