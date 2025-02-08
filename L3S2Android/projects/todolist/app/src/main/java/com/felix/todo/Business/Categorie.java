package com.felix.todo.Business;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/**
 * classe avec contraintes d'intégrités en CASCADE
 * parentColumns = Tache.cid
 * childColumns = "
 */
@Entity(tableName = "Categorie_table")
public class Categorie {
    @NonNull
    @ColumnInfo(name="categorie")
    private String nom;

    @PrimaryKey(autoGenerate = true)
    private long cid;


    // getters & setters

    @NonNull
    public String getNom() {
        return nom;
    }

    public void setNom(@NonNull String nom) {
        this.nom = nom;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }
}






