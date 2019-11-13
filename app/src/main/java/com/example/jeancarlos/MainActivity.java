package com.example.jeancarlos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume();
        // en este punto la aplicacion ya cargo
        // this en una activity (capturas el boton levantas
        //this es un conrexto
        Toast.makeText(this,
                "ella no te ama ni te amara",
                Toast.LENGTH_LONG).show();
    }
    //ESTE CODIGO SE EJECUTA ANTES DE TODO
    @Override
    protected void onStop(){
        super.onStop();

        Toast.makeText(this,
                "POR QUE ERES ASI",
                Toast.LENGTH_SHORT).show();

    }
}
