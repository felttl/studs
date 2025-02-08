package com.felix.todo.main;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import com.felix.todo.DAO.AppDatabase;
import com.felix.todo.R;

public class MainTodoApp extends AppCompatActivity {

    private Button ajouterTacheB;
    private Button setTacheFaiteB;
    private Button ajouterNouvCategB;
    private Button supprCategB;
    private Spinner listCategSpin;
    private EditText saisieTextET;

    private AppDatabase appDB;

    /**
     * on créer le projet avec une méthode Agile (petit a petit)
     * (Agile commence normalement par la fin)<br>
     * 1. Entity (Métier) <br>
     * 2. DAO<br>
     * 3. Point d'entrée (singleton)<br>
     * - test + jeu d'essaie<br>
     * 4. repository<br>
     * 5. activity + ViewModel associé<br>
     * @param savedInstanceState to reuse in defalut oncreate (with super)
     */
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // by default
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // create DB instance with singleton
        this.appDB = AppDatabase.getDatabase(this);
        // link variables
        this.ajouterTacheB = findViewById(R.id.addTaskB);
        this.setTacheFaiteB = findViewById(R.id.setDoneTaskB);
        this.ajouterNouvCategB = findViewById(R.id.addNewCategB);
        this.supprCategB = findViewById(R.id.removeCategB);
        this.listCategSpin = findViewById(R.id.listCategSpin);
        this.saisieTextET = findViewById(R.id.enterTextET);
        // enddefault

        this.ajouterTacheB.setText("");
        this.ajouterTacheB.setCompoundDrawablesWithIntrinsicBounds(
            getResources().getDrawable(
                R.drawable.plus,
                getTheme()
            ), null, null, null
        );
        // add keyboard events
        this.addEvents();
        // update observers
        // code here
    }

    /**
     * add all actions code-side to buttons and
     * interactive content
     */
    protected void addEvents(){
        this.ajouterTacheB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // to code later
            }
        });
        this.setTacheFaiteB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // to code later
            }
        });
        this.ajouterNouvCategB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // to code later
            }
        });
        this.supprCategB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // to code later
            }
        });
        this.listCategSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // to code later
            }
        });
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}