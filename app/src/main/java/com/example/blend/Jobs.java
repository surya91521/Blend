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
        m.setImg(R.drawable.rh);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.careerbuilder.co.in");
        m.setImg(R.drawable.cb);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.indeed.co.in");
        m.setImg(R.drawable.d);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.job.com");
        m.setImg(R.drawable.jo);
        models.add(m);

        m = new Model();
        m.setCateg("https://recruit.theladders.com");
        m.setImg(R.drawable.lad);
        models.add(m);

        m = new Model();
        m.setCateg("https://in.linkedin.com/jobs");
        m.setImg(R.drawable.link);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.monsterindia.com");
        m.setImg(R.drawable.mons);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.simplyhired.co.in");
        m.setImg(R.drawable.sim);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.ziprecruiter.com");
        m.setImg(R.drawable.zip);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.dice.com");
        m.setImg(R.drawable.dice);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.indgovtjobs.in");
        m.setImg(R.drawable.indg);
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


