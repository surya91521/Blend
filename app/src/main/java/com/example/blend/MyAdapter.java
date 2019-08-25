package com.example.blend;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.health.HealthStats;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerVH> {

    private Context c;
    ArrayList<Model> models;


    public MyAdapter(Context c, ArrayList<Model> models) {

        this.c = c;
        this.models= models;

    }

    @NonNull
    @Override
    public MyAdapter.RecyclerVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        return new RecyclerVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVH holder, final int i) {


        holder.nameTxt.setText(models.get(i).getCateg());
        holder.imageView.setImageResource(models.get(i).getImg());

        holder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(i==0)
                {
                    Intent intent = new Intent(c,Anime.class);
                    c.startActivity(intent);
                }else if(i==1){
                    Intent intent = new Intent(c,Coding.class);
                    c.startActivity(intent);
                }else if(i==2) {
                    Intent intent = new Intent(c, Food.class);
                    c.startActivity(intent);
                }else if(i==3) {
                    Intent intent = new Intent(c, Fitness.class);
                    c.startActivity(intent);
                }else if(i==4) {
                    Intent intent = new Intent(c, Games.class);
                    c.startActivity(intent);
                }else if(i==5) {
                    Intent intent = new Intent(c, HealthCare.class);
                    c.startActivity(intent);
                }else if(i==6) {
                    Intent intent = new Intent(c, Jobs.class);
                    c.startActivity(intent);
                }else if(i==7) {
                    Intent intent = new Intent(c, Kids.class);
                    c.startActivity(intent);
                }else if(i==8) {
                    Intent intent = new Intent(c, Movies.class);
                    c.startActivity(intent);
                }else if(i==9) {
                    Intent intent = new Intent(c, Shops.class);
                    c.startActivity(intent);
                }else if(i==10) {
                    Intent intent = new Intent(c, Songs.class);
                    c.startActivity(intent);
                }

               Log.d("Card Number", String.valueOf(i));
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
