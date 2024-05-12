package com.example.splashscreen;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    // Widgets
    Button btn;
    TextView t1,t2;

    Animation animate_btn,animate_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        t1= findViewById(R.id.t1);
        t2=findViewById(R.id.t2);

        // Now let's add the animation
        animate_btn = AnimationUtils.loadAnimation(this,
                R.anim.animate_btn);

        animate_txt = AnimationUtils.loadAnimation(this,
                R.anim.animate_texts);

        btn.setAnimation(animate_btn);

        // Let's Create animation for the text
        t1.setAnimation(animate_txt);
        t2.setAnimation(animate_txt);



        // Thanks Guys and we hope you benifit from our course
        // free tutorials


        // please rate us 5 stars on udemy and susbcribe to our channel
        // Master Coding Channel
    }
}