package com.example.appraintlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class contactos extends AppCompatActivity{
    private ImageButton link,face,inst,twt,git,you;
    String url = "https://www.google.com/maps/@-4.0175171,-79.2125396,3a,75y,180h,80t/data=!3m4!1e1!3m2!1sAF1QipPCqwQnRG1Wf5nfB2KgvgL1kY6pSaHyhS62RNxB!2e10";
    String urlfb = "https://www.facebook.com/TecnologicoLoja";
    String urlinst = "https://www.instagram.com/tecnologicoloja/?hl=es";
    String urltw = "https://twitter.com/tecnologicoloja?lang=es";
    String urlgit = "https://github.com/trema-tech/";
    String urlyou = "https://www.youtube.com/channel/UCKcQ2KvksH21kCAZ76daGoA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactos);
        link = findViewById(R.id.map);
        link.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
        //Metodo para poner un link a uma imagebutton para q me redirecciones a la pagina de facebook
        face = findViewById(R.id.imageButton6);
        face.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(urlfb);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
        //Metodo para poner un link a uma imagebutton para q me redirecciones a la pagina de instagram
        inst = findViewById(R.id.imageButton8);
        inst.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(urlinst);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
        //Metodo para poner un link a uma imagebutton para q me redirecciones a la pagina de twter
        twt = findViewById(R.id.imageButton9);
        twt.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(urltw);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
        //Metodo para poner un link a uma imagebutton para q me redirecciones a la pagina de git
        git = findViewById(R.id.imageButton10);
        git.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(urlgit);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
        //Metodo para poner un link a uma imagebutton para q me redirecciones a la pagina de youtube
        you = findViewById(R.id.imageButton7);
        you.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(urlyou);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });


    }
}