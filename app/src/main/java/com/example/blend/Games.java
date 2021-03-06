package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Games extends AppCompatActivity {



    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("http://oceanofgames.com/");
        m.setImg(R.drawable.ocea);
        models.add(m);

        m = new Model();
        m.setCateg("https://store.steampowered.com");
        m.setImg(R.drawable.steam);
        models.add(m);

        m = new Model();
        m.setCateg("https://games.softpedia.com");
        m.setImg(R.drawable.soft);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.ea.com");
        m.setImg(R.drawable.ea);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.skidrowreloaded.com");
        m.setImg(R.drawable.ski);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.origin.com/usa/en-us/");
        m.setImg(R.drawable.ori);
        models.add(m);

        m = new Model();
        m.setCateg("https://thepcgames.net");
        m.setImg(R.drawable.pc);
        models.add(m);

        m = new Model();
        m.setCateg("https://pcgameslab.net");
        m.setImg(R.drawable.lab);
        models.add(m);

        m = new Model();
        m.setCateg("https://en.softonic.com");
        m.setImg(R.drawable.soo);
        models.add(m);

        m = new Model();
        m.setCateg("http://www.friv.com");
        m.setImg(R.drawable.frin);
        models.add(m);


        return models;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_games);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}



