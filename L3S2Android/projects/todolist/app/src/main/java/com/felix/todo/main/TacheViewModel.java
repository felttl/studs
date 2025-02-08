package com.felix.todo.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.felix.todo.Business.Tache;

import java.util.ArrayList;

/**
 * gère les objets affichés, mets a jour l'affichage de la vue qui affiche tous les objets
 * de la base de données (objet entités qui sont convertis de objetMO en objet "normaux")
 * sur le modèle MVVM, une méthode d'observation est appelée derrière
 */
public class TacheViewModel extends AndroidViewModel {

    private TacheRepository tRepository;
    private MutableLiveData<ArrayList<Tache>> taches;


    public TacheViewModel(@NonNull Application application) {
        super(application);
        this.tRepository = new TacheRepository(application);
        this.taches = tRepository.getAllTaches();
    }
}
