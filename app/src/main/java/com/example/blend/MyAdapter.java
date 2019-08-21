package com.example.blend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerVH> {

    Context c;
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
    public void onBindViewHolder(@NonNull RecyclerVH holder, int i) {


        holder.nameTxt.setText(models.get(i).getCateg());
        holder.imageView.setImageResource(models.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return models.size();

    }

    public static class RecyclerVH extends RecyclerView.ViewHolder {


        TextView nameTxt;
        ImageView imageView;


        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            nameTxt = (TextView) itemView.findViewById(R.id.anime);
            imageView= (ImageView)itemView.findViewById(R.id.Anime);

        }
    }
}
