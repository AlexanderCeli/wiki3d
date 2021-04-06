package com.example.appraintlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sobre extends AppCompatActivity {
    private ImageButton link;
    String url = "https://tecnologicoloja.edu.ec";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);
        link = findViewById(R.id.istl);
        link.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
    }
}