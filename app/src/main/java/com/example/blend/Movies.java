package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Movies extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://cmovies.co");
        m.setImg(R.drawable.cmo);
        models.add(m);

        m = new Model();
        m.setCateg("http://www.foxmovies.pro");
        m.setImg(R.drawable.fox);
        models.add(m);

        m = new Model();
        m.setCateg("https://movie.worldtv24.us");
        m.setImg(R.drawable.wor);
        models.add(m);

        m = new Model();
        m.setCateg("https://www9.0123movies.com");
        m.setImg(R.drawable.moo);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.moviego.site");
        m.setImg(R.drawable.movg);
        models.add(m);

        m = new Model();
        m.setCateg("https://go.filmhd4u.com");
        m.setImg(R.drawable.fm);
        models.add(m);

        m = new Model();
        m.setCateg("https://putlocker.kz");
        m.setImg(R.drawable.put);
        models.add(m);

        m = new Model();
        m.setCateg("https://gomoviesfree.sc");
        m.setImg(R.drawable.gooo);
        models.add(m);

        m = new Model();
        m.setCateg("https://01fmovies.com");
        m.setImg(R.drawable.fff);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.123moviesla.com");
        m.setImg(R.drawable.one);
        models.add(m);

        m = new Model();
        m.setCateg("https://filmyanju.co");
        m.setImg(R.drawable.yanju);
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_movies);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}


