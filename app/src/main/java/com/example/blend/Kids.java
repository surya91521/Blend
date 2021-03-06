package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Kids extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.curiousworld.com");
        m.setImg(R.drawable.cur);
        models.add(m);

        m = new Model();
        m.setCateg("https://pbskids.org");
        m.setImg(R.drawable.pbs);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.babytv.com");
        m.setImg(R.drawable.bab);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.funbrain.com");
        m.setImg(R.drawable.fun);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.abcmouse.com");
        m.setImg(R.drawable.mous);
        models.add(m);

        m = new Model();
        m.setCateg("https://kids.nationalgeographic.com");
        m.setImg(R.drawable.ngk);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.brainpop.com");
        m.setImg(R.drawable.bpop);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.farfaria.com");
        m.setImg(R.drawable.far);
        models.add(m);

        m = new Model();
        m.setCateg("http://www.agnitus.com");
        m.setImg(R.drawable.agn);
        models.add(m);



        return models;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_kids);
        RecyclerView list = (RecyclerView)findViewById(R.id.Animes);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter1(this,getMyList()));
    }
}

