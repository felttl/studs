package com.felix.todo.Business;

import androidx.lifecycle.LiveData;
import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

/**
 * make easier to maintain and keep constraints
 * on Entities
 */
public class CategGrouped {
	@Embedded // integrate the object directly in the "tuple" SQLite
	private Categorie categorie;
	@Relation(
		parentColumn = "cid",
		entityColumn = "cid"
	)
	private List<Tache> taches;
	
	public Categorie getCategorie() {
		return categorie;
	}
	
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public List<Tache> getTaches() {
		return taches;
	}
	
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
}