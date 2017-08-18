package com.grademojo.for_x;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private RecyclerView recyclerView, recyclerView1;

    private My_Adapter mAdapter;

    private My_Adapter_2 myAdapter2;

    private RecyclerView.LayoutManager mLayoutManager, layoutManager2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tem);


        recyclerView = (RecyclerView) findViewById(R.id.recylcer_view_1);
        recyclerView1 = (RecyclerView) findViewById(R.id.recylcer_view_2);






        List<String> input = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            input.add("Test" + i);
        }// define an adapter
        mAdapter = new My_Adapter(input);
        recyclerView.setAdapter(mAdapter);




        recyclerView.setAdapter(mAdapter);


        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);







        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);


        recyclerView.setLayoutManager(mLayoutManager);



        List<String> input1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            input.add("Test" + i);
        }// define an adapter
        myAdapter2 = new My_Adapter_2(input);
        recyclerView1.setAdapter(myAdapter2);




        recyclerView.setAdapter(mAdapter);


        SnapHelper snapHelper1 = new LinearSnapHelper();
        snapHelper1.attachToRecyclerView(recyclerView1);







        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);


        recyclerView1.setLayoutManager(layoutManager2);






    }
}

