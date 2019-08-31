package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Anime extends AppCompatActivity {

        ImageView imageView;

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://9anime.to");
        m.setImg(R.drawable.ani);
        models.add(m);

        m = new Model();
        m.setCateg("https://www9.gogoanime.io");
        m.setImg(R.drawable.goo);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.crunchyroll.com");
        m.setImg(R.drawable.crunch);
        models.add(m);

        m = new Model();
        m.setCateg("https://kissanime.ru");
        m.setImg(R.drawable.kiss);
        models.add(m);

        m = new Model();
        m.setCateg("https://animefrenzy.net");
        m.setImg(R.drawable.frenzy);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.animefreak.tv");
        m.setImg(R.drawable.freak);
        models.add(m);

        m = new Model();
        m.setCateg("http://www1.chia-anime.com/");
        m.setImg(R.drawable.chia);
        models.add(m);

        m = new Model();
        m.setCateg("https://animedao.com");
        m.setImg(R.drawable.dao);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.anime-planet.com");
        m.setImg(R.drawable.plan);
        models.add(m);

        m = new Model();
        m.setCateg("https://ww1.kuroani.me");
        m.setImg(R.drawable.kuro);
        models.add(m);

        m = new Model();
        m.setCateg("https://animekarma.com");
        m.setImg(R.drawable.kar);
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_anime);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));



    }
}
