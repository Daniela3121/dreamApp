package com.example.diseasesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView appNmae;
    TextView generalData;
    TextView personD;
    TextView ld;
    TextView dyk;
    ImageView moon;
    ImageView lucidDreaming;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appNmae=findViewById(R.id.appTitle);
        generalData=findViewById(R.id.respiratory);
        personD=findViewById(R.id.cardio);
        ld=findViewById(R.id.bacterial);
        dyk=findViewById(R.id.mental);
        moon=findViewById(R.id.iv1);
        lucidDreaming=findViewById(R.id.iv2);

        moon.setImageResource(R.drawable.stealingmoon);
        lucidDreaming.setImageResource(R.drawable.luciddreaming2);

        generalData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 goToRespiratory();
            }
        });

        personD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCardio();
            }
        });
        ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBacterial();
            }
        });
        dyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            goToMental();
            }
        });
    }
    public void goToRespiratory(){
        Intent toRespiratory=new Intent(this,respiratory.class);
        startActivity(toRespiratory);
    }

    public void goToCardio(){
        Intent toCardio=new Intent(this, cardio.class);
        startActivity(toCardio);
    }
    public void goToBacterial(){
        Intent toBacterial=new Intent(this, bacterial.class);
        startActivity(toBacterial);
    }
    public void goToMental(){
        Intent toMental=new Intent(this,mental.class);
        startActivity(toMental);
    }
}
