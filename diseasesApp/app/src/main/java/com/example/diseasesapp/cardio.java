package com.example.diseasesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cardio extends AppCompatActivity {

        ImageView girldreming;
        TextView text;
        Button buttonA;
        Button buttonB;
        Button buttonC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
        girldreming=findViewById(R.id.iv4);
        text=findViewById(R.id.persontv);
        buttonA=findViewById(R.id.buttonA);
        buttonB=findViewById(R.id.buttonB);
        buttonC=findViewById(R.id.buttonC);

        girldreming.setImageResource(R.drawable.girldreaming);


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("What does it mean when you dream about someone you like, with whom you are in love? well... " +
                        "According to DreamDictionary, if you're dreaming about your crush on an ongoing basis, it means that not only are you probably thinking about them during the day," +
                        " but you also have a desire to express your true feelings to them, and your subconscious is telling you to just go for it already.");
            }
        });

//        buttonA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                text.setText("most of the dreams are encoded in symbols rather than a direct representation of your thoughts.\n\n"+"So there's a big chance that" +
//                        "dream with someone symbolizing someone else...\n\n"+"Historically, it has been thought that a dream associated with the death of a person bodes well." +
//                        "\n\n"+"A dream that shows a person who has been ill or an individual who displeases you is often an indication that you are afraid of what the future holds for you.\n\n"+);
//            }
//        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Historically, it has been thought that a dream associated with the death of a person bodes well." +
                        "A dream that shows a person who has been ill or an individual who displeases you is often an indication that you are afraid of what the future holds for you.");
            }
        });

    }
}
