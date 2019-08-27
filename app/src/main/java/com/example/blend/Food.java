package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.allrecipes.com");
        m.setImg(R.drawable.reci);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.thekitchn.com");
        m.setImg(R.drawable.it);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.food.com");
        m.setImg(R.drawable.foo);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.foodnetwork.com");
        m.setImg(R.drawable.fon);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.cookinglight.com");
        m.setImg(R.drawable.col);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.yummly.com");
        m.setImg(R.drawable.yum);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.epicurious.com");
        m.setImg(R.drawable.epi);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.bettycrocker.com");
        m.setImg(R.drawable.bet);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.cooks.com");
        m.setImg(R.drawable.cok);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.chowhound.com");
        m.setImg(R.drawable.chow);
        models.add(m);

        m = new Model();
        m.setCateg("http://www.eatingwell.com");
        m.setImg(R.drawable.well);
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_food);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}
