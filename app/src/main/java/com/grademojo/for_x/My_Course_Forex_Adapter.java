package com.grademojo.for_x;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sapling_a0 on 18/8/17.
 */

public class My_Course_Forex_Adapter extends RecyclerView.Adapter<My_Course_Forex_Adapter.ViewHolder> {


    private List<My_Course_Forex_Pojo> value1_2;




    public class ViewHolder extends RecyclerView.ViewHolder{

        public View border_forex;


        public TextView textView_My_course_forex;

        public ImageView image_My_Courses_forex;



        public View layout_view;


        public ViewHolder(View itemView) {

            super(itemView);


            layout_view =itemView;

            textView_My_course_forex = (TextView) itemView.findViewById(R.id.forex_text_view_my_course);

            image_My_Courses_forex = (ImageView) itemView.findViewById(R.id.forex_play_icon_my_course);

            border_forex  = itemView.findViewById(R.id.forex_border_my_course);







        }
    }


    public My_Course_Forex_Adapter(List<My_Course_Forex_Pojo> my_data_2)
    {

        value1_2 = my_data_2;

    }




    @Override
    public My_Course_Forex_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_forex_relative,parent,false);

        My_Course_Forex_Adapter.ViewHolder viewHolder = new My_Course_Forex_Adapter.ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(My_Course_Forex_Adapter.ViewHolder holder, int position) {


        My_Course_Forex_Pojo item = value1_2.get(position);


        String my_course_text_2 = value1_2.get(position).getIntroduction();


        holder.image_My_Courses_forex.setBackgroundResource(item.getImage_icon());


        holder.textView_My_course_forex.setText(""+my_course_text_2);

        holder.border_forex.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));




//        holder.border_View.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));
//
//        holder.border_View_first.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_2()));
//
//        holder.border_View_second.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_3()));

    }



    @Override
    public int getItemCount() {
        return value1_2.size();
    }

}

