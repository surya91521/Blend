package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Shops extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.amazon.in");
        m.setImg(R.drawable.anime);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.flipkart.com");
        m.setImg(R.drawable.coding);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.snapdeal.com");
        m.setImg(R.drawable.food);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.myntra.com");
        m.setImg(R.drawable.fitness);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.jabong.com");
        m.setImg(R.drawable.games);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.shopclues.com");
        m.setImg(R.drawable.healthcare);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.homeshop18.com");
        m.setImg(R.drawable.jobs);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.limeroad.com");
        m.setImg(R.drawable.kids);
        models.add(m);

        m = new Model();
        m.setCateg("https://in.ebay.com");
        m.setImg(R.drawable.movies);
        models.add(m);

        m = new Model();
        m.setCateg("https://best.aliexpress.com");
        m.setImg(R.drawable.shop);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.naaptol.com");
        m.setImg(R.drawable.songs);
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_shops);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}

