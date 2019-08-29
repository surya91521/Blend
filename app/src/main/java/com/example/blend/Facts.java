package com.example.blend;

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

public class Facts extends Fragment {

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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.facts,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Amazing Facts");
        imageView = view.findViewById(R.id.Random);
        textView = view.findViewById(R.id.random);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web8.class));
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web8.class));
            }
        });

        imageView1 = view.findViewById(R.id.World);
        textView1 = view.findViewById(R.id.world);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web9.class));
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web9.class));
            }
        });


        imageView2 = view.findViewById(R.id.Animals);
        textView2 = view.findViewById(R.id.animals);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web10.class));
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web10.class));
            }
        });

        imageView3 = view.findViewById(R.id.Space);
        textView3 = view.findViewById(R.id.space);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web11.class));
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web11.class));
            }
        });

        imageView4 = view.findViewById(R.id.Inventions);
        textView4 = view.findViewById(R.id.inventions);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web12.class));
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web12.class));
            }
        });

        imageView5 = view.findViewById(R.id.Phobia);
        textView5 = view.findViewById(R.id.phobia);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web13.class));
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web13.class));
            }
        });

        imageView6 = view.findViewById(R.id.Superstition);
        textView6 = view.findViewById(R.id.superstition);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web14.class));
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web14.class));
            }
        });

        imageView7 = view.findViewById(R.id.Food);
        textView7 = view.findViewById(R.id.food);

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web15.class));
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web15.class));
            }
        });


    }
    
}
