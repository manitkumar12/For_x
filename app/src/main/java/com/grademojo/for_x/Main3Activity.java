package com.grademojo.for_x;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class Main3Activity extends AppCompatActivity {

    private View city_view;
    private ImageView person_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        city_view = findViewById(R.id.City_icon);
        person_image = (ImageView) findViewById(R.id.person_image);

        city_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown).duration(1000);
            }
        });

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        //Log.d(All.TAG_LOG, "onWindowFocusChanged() called!");

        if (hasFocus) {
            //Log.d(All.TAG_LOG, "onWindowFocusChanged() and window has focus called!");

            //  askToSelectUserType(600, false);

            YoYo.with(Techniques.SlideInUp)
                    .duration(800)
                    .playOn(city_view);

            YoYo.with(Techniques.SlideInLeft)
                    .duration(1000)
                    .playOn(person_image);


        }


    }
}


