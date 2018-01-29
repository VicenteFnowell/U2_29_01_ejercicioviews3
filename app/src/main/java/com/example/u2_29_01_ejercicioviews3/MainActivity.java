package com.example.u2_29_01_ejercicioviews3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Creando Vistas
TextView tvprimero, tvcompuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvprimero = (TextView)findViewById(R.id.textobotar);
        tvcompuesto = (TextView)findViewById(R.id.textodecision);


    }//Fin OnCreate

    public void clicbalon (View view){
        tvprimero.setText("botar el balón");
    }
public void clickerror (View view){
        tvcompuesto.setText("Has decidido")+getText() ;

}

}//Fin Activity
