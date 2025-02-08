package com.felix.todo.Business;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/**
 * Business or "POJO" classes
 * - reminder : identifiers of a row are always
 * long typed in Room Database
 *  - classe with integrity constraints (in CASCADE mode)
 *  - parentColumns = Categorie.cid
 *  - childColumns = Tache.cid
 */
@Entity(
        tableName = "Tache_table",
        foreignKeys = @ForeignKey(
                entity = Categorie.class,
                parentColumns = "cid",
                childColumns = "cid",
                onDelete = ForeignKey.CASCADE
        )
)
public class Tache {

    @NonNull @ColumnInfo(name="libelleS")
    private String libelle;
    @NonNull @ColumnInfo(name="faiteB")
    private boolean done;

    @PrimaryKey(autoGenerate = true)
    private long tid; // task id

    // getters & setters


    @NonNull
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(@NonNull String libelle) {
        this.libelle = libelle;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }
}
