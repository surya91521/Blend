package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.amoyshare.com/free-mp3-finder/");
        m.setImg(R.drawable.find);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.mp3juices.cc");
        m.setImg(R.drawable.jui);
        models.add(m);

        m = new Model();
        m.setCateg("https://mp3skulls.to");
        m.setImg(R.drawable.skull);
        models.add(m);

        m = new Model();
        m.setCateg("http://beemp3s.org/");
        m.setImg(R.drawable.bee);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.emp3t.com");
        m.setImg(R.drawable.emp);
        models.add(m);

        m = new Model();
        m.setCateg("https://songspk3.org");
        m.setImg(R.drawable.sooo);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.mp3mad.biz");
        m.setImg(R.drawable.mad);
        models.add(m);

        m = new Model();
        m.setCateg("https://freemusicdownloads.world");
        m.setImg(R.drawable.frrm);
        models.add(m);

        m = new Model();
        m.setCateg("https://freemp3downloads.online");
        m.setImg(R.drawable.mppp);
        models.add(m);

        m = new Model();
        m.setCateg("https://free-mp3-download.net");
        m.setImg(R.drawable.mpu);
        models.add(m);

        m = new Model();
        m.setCateg("https://my-free-mp3s.com/");
        m.setImg(R.drawable.fremp  );
        models.add(m);

        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_songs);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}

