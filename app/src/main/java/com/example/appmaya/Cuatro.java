package com.example.appmaya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Cuatro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        CardView cardVieww;
        CardView cardView2;
        CardView cardView3;
        CardView cardView4;
        CardView cardView5;
        CardView cardView6;
        CardView cardView7;
        CardView cardView8;
        CardView cardView9;
        CardView cardView10;
        CardView cardView11;
        CardView cardView12;


        cardVieww = findViewById(R.id.videouno);
        cardVieww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, VideoUno.class);
                startActivity(a);

            }
        });

        cardView2 = findViewById(R.id.videodos);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Dos.class);
                startActivity(a);

            }
        });
        cardView3 = findViewById(R.id.videotres);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Tres.class);
                startActivity(a);

            }
        });
        cardView4 = findViewById(R.id.videocuatro);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Cuatro.class);
                startActivity(a);

            }
        });
        cardView5 = findViewById(R.id.videocinco);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Cinco.class);
                startActivity(a);

            }
        });
        cardView6 = findViewById(R.id.videoseis);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Seis.class);
                startActivity(a);

            }
        });
        cardView7 = findViewById(R.id.videosiete);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Siete.class);
                startActivity(a);

            }
        });
        cardView8 = findViewById(R.id.videoocho);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Ocho.class);
                startActivity(a);

            }
        });
        cardView9 = findViewById(R.id.videonueve);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Nueve.class);
                startActivity(a);

            }
        });
        cardView10 = findViewById(R.id.videodiez);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Diez.class);
                startActivity(a);

            }
        });
        cardView11 = findViewById(R.id.videoonce);
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Once.class);
                startActivity(a);

            }
        });
        cardView12 = findViewById(R.id.videodoce);
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Cuatro.this, Doce.class);
                startActivity(a);

            }
        });

    }
}
