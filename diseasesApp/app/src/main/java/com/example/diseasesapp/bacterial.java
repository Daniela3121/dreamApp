package com.example.diseasesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bacterial extends AppCompatActivity {

    ImageView lucidDreamsimg;
    TextView lucidDreamstv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacterial);

        lucidDreamsimg= findViewById(R.id.ldimg);
        lucidDreamstv=findViewById(R.id.ldtv);

        lucidDreamsimg.setImageResource(R.drawable.luciddream);

        lucidDreamstv.setText("A lucid dream is a dream during which the dreamer is aware that they are dreaming." +
                " During a lucid dream, the dreamer may gain some amount of control over the dream characters, narrative, and environment\n\n"+"Lucid dreaming is such" +
                "an extraordinary experience, here are some tips of you are interested in havimg total control over your dreams...\n\n " +
                "🦋 You need to start a dream jornal, immediately after you wake up, you have to write everything you remember about your dream" +
                "and be as specific as possible,this will help you identify recurrent factors during your dream.\n\n"+
                "🦋 something else really important are reality checks, these consist in making sure you ARE NOT dreaming multiple times a day, for example you can look at your" +
                " fingers looking for anomalies, other option is to cover your nose and check is you're able to breath." +
                "\n\nThis reality checks need to be done often and detailed so that you can master it and increment your chances of checking during" +
                " a dream and give you the power to change anything you want.");
    }
}
