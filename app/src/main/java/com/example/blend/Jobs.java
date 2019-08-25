package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Jobs extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.roberthalf.com");
        m.setImg(R.drawable.anime);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.careerbuilder.co.in");
        m.setImg(R.drawable.coding);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.indeed.co.in");
        m.setImg(R.drawable.food);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.job.com");
        m.setImg(R.drawable.fitness);
        models.add(m);

        m = new Model();
        m.setCateg("https://recruit.theladders.com");
        m.setImg(R.drawable.games);
        models.add(m);

        m = new Model();
        m.setCateg("https://in.linkedin.com/jobs");
        m.setImg(R.drawable.healthcare);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.monsterindia.com");
        m.setImg(R.drawable.jobs);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.simplyhired.co.in");
        m.setImg(R.drawable.kids);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.ziprecruiter.com");
        m.setImg(R.drawable.movies);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.dice.com");
        m.setImg(R.drawable.shop);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.indgovtjobs.in");
        m.setImg(R.drawable.songs);
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_jobs);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}


