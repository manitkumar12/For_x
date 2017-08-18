package com.grademojo.for_x;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {
    private RecyclerView recyclerView_3;

    private My_Course_Adapter m_Adapter;



    private List<My_COurse_Pojo_class> input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);


        recyclerView_3 = (RecyclerView) findViewById(R.id.recycler_view_3);



        input = new ArrayList<>();


        input.add(new My_COurse_Pojo_class(
                R.drawable.face,

                "first "));

        input.add(new My_COurse_Pojo_class(
                R.drawable.logo_blue,

                "Second"
        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.logo_blue,
                "third"
        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.forex_logo,
                "fourth"));



        input.add(new My_COurse_Pojo_class(
                R.drawable.facebook,
                "five"

        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.google_plus,
                "six"

        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.face,
                "seven"

        ));


        m_Adapter = new My_Course_Adapter(input);
        recyclerView_3.setAdapter(m_Adapter);




        int maxSpansPerRow = 6;



        final GridLayoutManager gridview = new GridLayoutManager(this,maxSpansPerRow);

        gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {


                if (input.size() % 2 == 1)

                {
                    if (position == input.size() - 1) {

                        return 6;

                    } else {

                        return 3;
                    }
                }
                else {

                    return 3;
                }


//                switch (position % 7) {
//                    // first three items span 3 columns each
//                    case 0:
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                    case 5:
//                        return 3;
//                    // next four items span 2 columns each
//
//
//                    case 6:
//                        return 6;
//                }
//                return position;
            }



        });

        recyclerView_3.setLayoutManager(gridview);
    }
}
