package com.example.blend;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Sites extends Fragment {

    private RecyclerView rv;
    private  static String[] categories={"Anime","Food","Coding","Shopping","Fitness","Kids Learning","Songs","Movies","Games","Jobs","Heath Care"};
   /* private int [] images = {R.drawable.anime,R.drawable.coding, R.drawable.food ,R.drawable.fitness , R.drawable.games
                              , R.drawable.healthcare , R.drawable.jobs , R.drawable.kids ,R.drawable.movies, R.drawable.shop, R.drawable.songs};*/

    public static Sites newInstance()
    {
        Sites sites = new Sites();
        return sites;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sites,null);
        rv = (RecyclerView) rootView.findViewById(R.id.Sites);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new MyAdapter(getActivity(),categories));
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Sites Categories");


    }

    @Override
    public String toString() {
        return "Sites";
    }
}
