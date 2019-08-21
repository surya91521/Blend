package com.example.blend;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerVH> {

    Context c;
    String[] categories;

    public MyAdapter(Context c , String[] categories) {

        this.c = c;
        this.categories = categories;
    }


    @NonNull
    @Override
    public MyAdapter.RecyclerVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        return new RecyclerVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVH holder, int i) {

        holder.nameTxt.setText(categories[i]);

    }

    @Override
    public int getItemCount() {
        return categories.length;
    }

    public class RecyclerVH extends RecyclerView.ViewHolder {

        TextView nameTxt;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            nameTxt = (TextView) itemView.findViewById(R.id.anime);

        }
    }
}
