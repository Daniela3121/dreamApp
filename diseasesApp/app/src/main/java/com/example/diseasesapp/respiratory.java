package com.example.diseasesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class respiratory extends AppCompatActivity {
    ImageView sleepingdude;
    TextView definition;
    TextView definitionQ;
    ScrollView scrollView4;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiratory);

        sleepingdude=findViewById(R.id.iv3);
        definition=findViewById(R.id.persontv);
        definitionQ=findViewById(R.id.dreamingQ);
        scrollView4=findViewById(R.id.scrollview4);
        next=findViewById(R.id.next);

        sleepingdude.setImageResource(R.drawable.sleepingdude);

        definition.setText("Dreaming if derined as a series of thoughts, images, and sensations occurring in a person's mind during sleep. But besides thig general information," +
                " dreaming is one of the ways your mind has to communicate with you" +
                "we all know that dreams don't always make sense, but in some occasions, even thought they might seem senseless, after you analyse them you " +
                "you discover the meaning behind every situation, symbol or person that appears in your drams.\n\n"+"Do you want to check another result?");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                definition.setText("   ");
            }
        });

    }
}
