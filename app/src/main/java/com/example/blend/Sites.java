package com.example.blend;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class Sites extends Fragment {

    private RecyclerView rv;

    public static Sites newInstance()
    {
        Sites sites = new Sites();
        return sites;
    }


    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("Anime");
        m.setImg(R.drawable.anime);
        models.add(m);

        m = new Model();
        m.setCateg("Coding");
        m.setImg(R.drawable.coding);
        models.add(m);

        m = new Model();
        m.setCateg("Food Recipes");
        m.setImg(R.drawable.food);
        models.add(m);

        m = new Model();
        m.setCateg("Fitness");
        m.setImg(R.drawable.fitness);
        models.add(m);

        m = new Model();
        m.setCateg("Games");
        m.setImg(R.drawable.games);
        models.add(m);

        m = new Model();
        m.setCateg("Health Care");
        m.setImg(R.drawable.healthcare);
        models.add(m);

        m = new Model();
        m.setCateg("Jobs Search");
        m.setImg(R.drawable.jobs);
        models.add(m);

        m = new Model();
        m.setCateg("Kids Learning");
        m.setImg(R.drawable.kids);
        models.add(m);

        m = new Model();
        m.setCateg("Movies");
        m.setImg(R.drawable.movies);
        models.add(m);

        m = new Model();
        m.setCateg("Shops");
        m.setImg(R.drawable.shop);
        models.add(m);

        m = new Model();
        m.setCateg("Songs");
        m.setImg(R.drawable.songs);
        models.add(m);

        return models;
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sites,null);
        rv = (RecyclerView) rootView.findViewById(R.id.Sites);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new MyAdapter(getActivity(),getMyList()));
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
