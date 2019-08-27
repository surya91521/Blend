package com.example.blend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HealthCare extends AppCompatActivity {

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models= new ArrayList<>();
        Model m = new Model();
        m.setCateg("https://www.nih.gov");
        m.setImg(R.drawable.ni);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.webmd.com/default.htm");
        m.setImg(R.drawable.md);
        models.add(m);

        m = new Model();
        m.setCateg("https://kidshealth.org");
        m.setImg(R.drawable.hea);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.drugs.com");
        m.setImg(R.drawable.dru);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.weightwatchers.com/us/");
        m.setImg(R.drawable.wei);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.netdoctor.co.uk");
        m.setImg(R.drawable.nee);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.menshealth.com");
        m.setImg(R.drawable.me);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.healthline.com");
        m.setImg(R.drawable.heal);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.mayoclinic.org");
        m.setImg(R.drawable.mayo);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.cdc.gov");
        m.setImg(R.drawable.sdc);
        models.add(m);

        m = new Model();
        m.setCateg("https://www.medicinenet.com");
        m.setImg(R.drawable.med);
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



