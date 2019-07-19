package com.ebiztechnocrats.daggerdemo1withcontext;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import javax.inject.Inject;

import di.App;
import di.RetrofitService;

public class MainActivity extends AppCompatActivity {

    @Inject Context ctx;
    @Inject RetrofitService service;

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getComponent().inject(this);

        img=findViewById(R.id.imageView);


    }
}
