package com.example.blend;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter.RecyclerVH>  {

    Context c1;
    ArrayList<Model> models;


    public MyAdapter1(Context c, ArrayList<Model> models) {

        this.c1 = c;
        this.models= models;

    }

    @NonNull
    @Override
    public MyAdapter.RecyclerVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(c1).inflate(R.layout.model,viewGroup,false);
        return new MyAdapter.RecyclerVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.RecyclerVH holder, int i) {


        holder.nameTxt.setText(models.get(i).getCateg());
        holder.imageView.setImageResource(models.get(i).getImg());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();

    }

    public static class RecyclerVH extends RecyclerView.ViewHolder {


        TextView nameTxt;
        ImageView imageView;
        CardView cardView;


        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            nameTxt = (TextView) itemView.findViewById(R.id.anime);
            imageView= (ImageView)itemView.findViewById(R.id.Anime);
            cardView=(CardView)itemView.findViewById(R.id.intent);

        }
    }


}

