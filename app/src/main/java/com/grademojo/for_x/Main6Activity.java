package com.grademojo.for_x;

import android.app.ProgressDialog;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity  {

    private RecyclerView recyclerView_4;

    private MediaController mediaController;
    private VideoView videoView;


    private My_Course_Forex_Adapter my_course_forex_adapter;

    private RecyclerView.LayoutManager mLayoutManager;



    private List<My_Course_Forex_Pojo> input;




    private Button mediaController1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main6);


        recyclerView_4 = (RecyclerView) findViewById(R.id.recycler_view_4);



        mediaController1 = (Button) findViewById(R.id.media);
        mediaController = new MediaController(this);



        mediaController1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.video;
                Uri uri = Uri.parse(uriPath);
                videoView.setVideoURI(uri);
                videoView.start();
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
            }
        });








        videoView = (VideoView) findViewById(R.id.video_1);

        getWindow().setFormat(PixelFormat.UNKNOWN);






        mLayoutManager = new LinearLayoutManager(this);

        recyclerView_4.setLayoutManager(mLayoutManager);


        input = new ArrayList<>();


        input.add(new My_Course_Forex_Pojo(
                R.drawable.green_icon,

                "first ", R.color.green));

        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,

                "Second", R.color.grey
        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "third", R.color.grey
        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "fourth"
                , R.color.grey
        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "five", R.color.grey

        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "six", R.color.grey

        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "seven", R.color.grey

        ));


        my_course_forex_adapter = new My_Course_Forex_Adapter(input);
        recyclerView_4.setAdapter(my_course_forex_adapter);


    }






//        });



}
