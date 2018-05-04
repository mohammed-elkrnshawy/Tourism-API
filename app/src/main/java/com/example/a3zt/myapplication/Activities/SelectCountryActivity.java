package com.example.a3zt.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.a3zt.myapplication.R;
import com.example.a3zt.myapplication.Remote.ApiUtlis;
import com.example.a3zt.myapplication.Remote.UserService;

public class SelectCountryActivity extends AppCompatActivity {
private RelativeLayout relativeLayoutEgypt,relativeLayoutItalya,relativeLayoutNeu,relativeLayoutChina
        ,relativeLayoutUs,relativeLayoutfr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.select);

        InitComponent();

        relativeLayoutEgypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectCountryActivity.this,ShowPlaces.class);
                intent.putExtra("Flag","Eg");
                startActivity(intent);
            }
        });

        relativeLayoutItalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectCountryActivity.this,ShowPlaces.class);
                intent.putExtra("Flag","It");
                startActivity(intent);
            }
        });

        relativeLayoutfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectCountryActivity.this,ShowPlaces.class);
                intent.putExtra("Flag","Fr");
                startActivity(intent);
            }
        });

        relativeLayoutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectCountryActivity.this,ShowPlaces.class);
                intent.putExtra("Flag","Us");
                startActivity(intent);
            }
        });

        relativeLayoutChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectCountryActivity.this,ShowPlaces.class);
                intent.putExtra("Flag","Ch");
                startActivity(intent);
            }
        });

        relativeLayoutNeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectCountryActivity.this,ShowPlaces.class);
                intent.putExtra("Flag","Nu");
                startActivity(intent);
            }
        });


    }

    private void InitComponent() {
        relativeLayoutEgypt=findViewById(R.id.relativeLayoutEgypt);
        relativeLayoutItalya=findViewById(R.id.relativeLayoutItaly);
        relativeLayoutNeu=findViewById(R.id.relativeLayoutNeu);
        relativeLayoutChina=findViewById(R.id.relativeLayoutChina);
        relativeLayoutUs=findViewById(R.id.relativeLayoutUS);
        relativeLayoutfr=findViewById(R.id.relativeLayoutFrance);
    }


}
