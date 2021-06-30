package com.example.diseasesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class mental extends AppCompatActivity {

    ImageView dyk;
    TextView txtdyk;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental);

        dyk=findViewById(R.id.dykimg);
        txtdyk=findViewById(R.id.didyouknowtv);
        scrollView=findViewById(R.id.scrollView3);

        dyk.setImageResource(R.drawable.didyouknow);

        txtdyk.setText("🦋You Forget 90% of Your Dreams. Within 5 minutes of waking half of your dream is forgotten.\n\n" +
                "🦋Blind People also Dream: People who became blind after birth can see images in their dreams. People who are born blind do not see any visuals, but have dreams equally vivid involving their other senses of sound, smell, touch and emotion.\n\n" +
                "🦋Every human being dreams (except in cases of extreme psychological disorder). If you think you are not dreaming – you just forget your dreams.\n\n" +
                "🦋In Our Dreams, We Only See Faces That We Already Know because our mind is not capable of making up faces.\n\n" +
                "🦋Not Everybody Dreams in Color. A full 12% of sighted people dream exclusively in black and white. The remaining number have full color dreams.\n\n" +
                "🦋Dreams are Symbolic. If you dream about some particular subject it is not often that the dream is about that. Dreams speak in a deeply symbolic language. Whatever symbol your dream picks on it is most unlikely to be a symbol for itself.\n\n" +
                "\n" +
                "🦋The most common emotion experienced in dreams is anxiety. Negative emotions are more common than positive ones.\n\n" +
                "🦋You can have four to seven dreams in one night.\n\n" + "🦋Animals Dream Too.\n\n"+"🦋Men and Women Dream Differently\n\n" +
                "🦋Men tend to dream more about other men. Around 70% of the characters in a man’s dream are other men. On the other hand, a woman’s dream contains almost an equal number of men and women. Aside from that, men generally have more aggressive emotions in their dreams than the female lot.\n\n"
                +"🦋Rummors say that if you're snoring, you cannot be dreaming.\n\n"
        +"🦋You can experience an o r g a s m in your dream\n\n" +
                "🦋You can not only have sex as pleasurable as in your real life while dreaming but also experience an orgasm as strong as a real one without any wet results.\n\n"+
                "🦋The sensations felt while Lucid Dreaming can be as strong or even stronger than in real life.");
    }
}
