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

public class Mini extends Fragment {

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
        return inflater.inflate(R.layout.minigames, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Mini Games");

        imageView = view.findViewById(R.id.Pac);
        textView = view.findViewById(R.id.pac);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web16.class));
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web16.class));
            }
        });

        imageView1 = view.findViewById(R.id.Flappy);
        textView1 = view.findViewById(R.id.flappy);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web17.class));
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web17.class));
            }
        });

        imageView2 = view.findViewById(R.id.Rex);
        textView2 = view.findViewById(R.id.rex);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web18.class));
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web18.class));
            }
        });

        imageView3 = view.findViewById(R.id.Gnome);
        textView3 = view.findViewById(R.id.gnome);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web19.class));
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web19.class));
            }
        });

        imageView4 = view.findViewById(R.id.Ghost);
        textView4 = view.findViewById(R.id.ghost);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web20.class));
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web20.class));
            }
        });

        imageView5 = view.findViewById(R.id.Cat);
        textView5 = view.findViewById(R.id.cat);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web21.class));
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web21.class));
            }
        });

        imageView6 = view.findViewById(R.id.Cloud);
        textView6 = view.findViewById(R.id.cloud);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web22.class));
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web22.class));
            }
        });

        imageView7 = view.findViewById(R.id.Fly);
        textView7 = view.findViewById(R.id.fly);

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web23.class));
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Web23.class));
            }
        });

    }
}
