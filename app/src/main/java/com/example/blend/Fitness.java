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
        m.setCateg("https://mennohenselmans.com");
        m.setImg(R.drawable.men);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.12minuteathlete.com");
        m.setImg(R.drawable.min);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.ontheregimen.com");
        m.setImg(R.drawable.gi);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.syattfitness.com");
        m.setImg(R.drawable.sya);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.summertomato.com");
        m.setImg(R.drawable.tom);
        models.add(m);

        m = new Model();
        m.setCateg("https://fatburningman.com");
        m.setImg(R.drawable.fat);
        models.add(m);

        m = new Model();
        m.setCateg("https://johnfawkes.com");
        m.setImg(R.drawable.john);
        models.add(m);

        m = new Model();
        m.setCateg("http://www.lookgreatnaked.com");
        m.setImg(R.drawable.great);
        models.add(m);

        m = new Model();
        m.setCateg("https://bachperformance.com");
        m.setImg(R.drawable.bach);
        models.add(m);

        m = new Model();
        m.setCateg("https://strengthsensei.com");
        m.setImg(R.drawable.sen);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.marksdailyapple.com");
        m.setImg(R.drawable.ma);
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

