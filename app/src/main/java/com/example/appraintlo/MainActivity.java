package com.example.appraintlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private ImageButton inii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton inii = (ImageButton) findViewById(R.id.imageButton3);
        inii.setOnClickListener(this);

    }
    // se creo el metodo para el boton iniciar cambie de pantalla
    public void onClick(View view) {
        Intent intent = new Intent(this, ini.class);
        startActivity(intent);
    }
}