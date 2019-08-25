package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Fitness extends AppCompatActivity {

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
        m.setCateg("Food");
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
        m.setCateg("Jobs");
        m.setImg(R.drawable.jobs);
        models.add(m);

        m = new Model();
        m.setCateg("Kids");
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_fitness);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
    }

