package com.example.blend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class News extends Fragment {

    ImageView imageView;
    TextView textView;
    ImageView imageView1;
    TextView textView1;
    ImageView imageView2;
    TextView textView2;
    ImageView imageView3;
    TextView textView3;
    ImageView imageView4;
    TextView textView4;
    ImageView imageView5;
    TextView textView5;
    ImageView imageView6;
    TextView textView6;
    ImageView imageView7;
    TextView textView7;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news,container,false);



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("News Categories");
        imageView = view.findViewById(R.id.India);
        textView = view.findViewById(R.id.india);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web.class));
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web.class));
            }
        });

        imageView1 = view.findViewById(R.id.World);
        textView1 = view.findViewById(R.id.world);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web1.class));
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web1.class));
            }
        });


        imageView2 = view.findViewById(R.id.Buisness);
        textView2 = view.findViewById(R.id.buisness);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web2.class));
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web2.class));
            }
        });

        imageView3 = view.findViewById(R.id.Tech);
        textView3 = view.findViewById(R.id.tech);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web3.class));
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web3.class));
            }
        });

        imageView4 = view.findViewById(R.id.Lifestyle);
        textView4 = view.findViewById(R.id.lifestyle);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web4.class));
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web4.class));
            }
        });

        imageView5 = view.findViewById(R.id.Sports);
        textView5 = view.findViewById(R.id.sports);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web5.class));
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web5.class));
            }
        });

        imageView6 = view.findViewById(R.id.Entertainment);
        textView6 = view.findViewById(R.id.entertainment);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web6.class));
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web6.class));
            }
        });

        imageView7 = view.findViewById(R.id.Education);
        textView7 = view.findViewById(R.id.education);

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web7.class));
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web7.class));
            }
        });


    }


}
