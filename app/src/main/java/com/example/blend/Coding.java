package com.example.blend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Coding extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.hackerrank.com");
        m.setImg(R.drawable.hack);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.codechef.com");
        m.setImg(R.drawable.chef);
        models.add(m);

        m = new Model();
        m.setCateg("https://codeforces.com");
        m.setImg(R.drawable.code);
        models.add(m);

        m = new Model();
        m.setCateg("https://a2oj.com");
        m.setImg(R.drawable.aa);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.topcoder.com");
        m.setImg(R.drawable.top);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.coderbyte.com");
        m.setImg(R.drawable.coderbyte);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.hirevue.com");
        m.setImg(R.drawable.hire);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.codewars.com");
        m.setImg(R.drawable.wars);
        models.add(m);

        m = new Model();
        m.setCateg("https://leetcode.com");
        m.setImg(R.drawable.leet);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.spoj.com");
        m.setImg(R.drawable.spoj);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.codingame.com/start");
        m.setImg(R.drawable.codes);
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_coding);
        RecyclerView list = (RecyclerView)findViewById(R.id.Anim);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}
