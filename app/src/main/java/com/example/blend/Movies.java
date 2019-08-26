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
        m.setImg(R.drawable.anime);
        models.add(m);

        m = new Model();
        m.setCateg("http://www.foxmovies.pro");
        m.setImg(R.drawable.coding);
        models.add(m);

        m = new Model();
        m.setCateg("https://movie.worldtv24.us");
        m.setImg(R.drawable.food);
        models.add(m);

        m = new Model();
        m.setCateg("https://www9.0123movies.com");
        m.setImg(R.drawable.fitness);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.moviego.site");
        m.setImg(R.drawable.games);
        models.add(m);

        m = new Model();
        m.setCateg("https://go.filmhd4u.com");
        m.setImg(R.drawable.healthcare);
        models.add(m);

        m = new Model();
        m.setCateg("https://putlocker.kz");
        m.setImg(R.drawable.jobs);
        models.add(m);

        m = new Model();
        m.setCateg("https://gomoviesfree.sc");
        m.setImg(R.drawable.kids);
        models.add(m);

        m = new Model();
        m.setCateg("https://01fmovies.com");
        m.setImg(R.drawable.movies);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.123moviesla.com");
        m.setImg(R.drawable.shop);
        models.add(m);

        m = new Model();
        m.setCateg("https://filmyanju.co");
        m.setImg(R.drawable.songs);
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


