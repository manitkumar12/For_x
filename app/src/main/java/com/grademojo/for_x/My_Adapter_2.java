package com.grademojo.for_x;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class My_Adapter_2 extends RecyclerView.Adapter<My_Adapter_2.ViewHolder> {


    private List<String> value;

    public class ViewHolder extends RecyclerView.ViewHolder{





        public TextView text_Name ;

        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;
            text_Name = (TextView) itemView.findViewById(R.id.mani);














//            text_Present.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    remove(getAdapterPosition());
//                }
//            });
        }



    }


    public My_Adapter_2(List<String> myDataset) {
        value = myDataset;
    }






    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.card_view_recycler_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    public void onBindViewHolder(ViewHolder holder, final int position) {

        final String name = value.get(position);

        holder.text_Name.setText(name);






    }

    @Override
    public int getItemCount() {
        return value.size();
    }


    // Information current=data.get(position);
    //   holder.title.setText(current.title);

    // holder.title.setText(current.title);


    //Integer.parseInt(view.getTag().toString())











//    public void remove(int position){
//
//        values.remove(position);
//        notifyItemRemoved(position);
//
//    }
}

