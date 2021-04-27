package com.example.appraintlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.net.URI;

public class ini extends AppCompatActivity {
ViewFlipper carrusel;
private ImageButton link;
String url = "https://www.google.com/maps/@-4.0175171,-79.2125396,3a,75y,180h,80t/data=!3m4!1e1!3m2!1sAF1QipPCqwQnRG1Wf5nfB2KgvgL1kY6pSaHyhS62RNxB!2e10";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ini);
        //Carga imagenes
        int images[] ={R.drawable.ra1,R.drawable.ra2,R.drawable.ra3};
        carrusel = findViewById(R.id.carrusel);
        for (int image: images){
            flipperImages(image);
        }
        //Cargar links en un boton
        link = findViewById(R.id.imageButton14);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
    }

    //metodo para poder abrir otra aplicaion desde un botton
    public void wikitude(View view) {
        String nombre_paquete = "com.wikitude.wikitudestudioandroidapptemplate";
        Intent i = new Intent();
        PackageManager manager = getPackageManager();
        i = manager.getLaunchIntentForPackage(nombre_paquete);
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);
    }
    //On click de los botones
    public void ayuda(View view) {
        Intent intent = new Intent(this, Ayuda.class);
        startActivity(intent);
    }
    public void sobre(View view) {
        Intent intent = new Intent(this, sobre.class);
        startActivity(intent);
    }
    public void contac(View view) {
        Intent intent = new Intent(this, contactos.class);
        startActivity(intent);
    }
    public void desa(View view) {
        Intent intent = new Intent(this, desarrollo.class);
        startActivity(intent);
    }


    public void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        carrusel.addView(imageView); // cargamos las imagenes
        carrusel.setFlipInterval(500);// intervalo de cada imagen q
        carrusel.setAutoStart(true); // para q cuando aparesca cargue
    }
 }