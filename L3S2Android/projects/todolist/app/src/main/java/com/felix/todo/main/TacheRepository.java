package com.felix.todo.main;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.felix.todo.Business.Tache;
import com.felix.todo.DAO.AppDatabase;
import com.felix.todo.DAO.TacheDao;

import java.util.List;

/**
 * gère la provenance des données utilisées/produite par notre app
 * pour un type d'objet spécifique Tache
 */
public class TacheRepository {

    private TacheDao tacheDao;
    private LiveData<List<Tache>> taches;

    public TacheRepository(Application application){
        AppDatabase db = AppDatabase.get
    }


}
