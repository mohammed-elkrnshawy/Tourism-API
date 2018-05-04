package com.example.a3zt.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a3zt.myapplication.Classes.Example;
import com.example.a3zt.myapplication.Classes.ListAdapter;
import com.example.a3zt.myapplication.Classes.Monument;
import com.example.a3zt.myapplication.R;
import com.example.a3zt.myapplication.Remote.ApiUtlis;
import com.example.a3zt.myapplication.Remote.UserService;
import com.example.a3zt.myapplication.TTTTTTTT;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShowPlaces extends AppCompatActivity {
    private TextView textView;
    private String Flag;
    private UserService userService;
    private ListView listView;
    private ListAdapter listAdapter;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_show_places);
        InitComponent();
        getFromIntent();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Monument monument=(Monument) parent.getItemAtPosition(position);
                if(monument.getMonumentArticle().isEmpty())
                {
                    Toast.makeText(ShowPlaces.this, "Not Article", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(ShowPlaces.this,DetailsActivity.class);
                    intent.putExtra("Lang",monument.getLang());
                    intent.putExtra("Object",monument.getMonumentArticle().replace("[[","").replace("]]",""));
                    startActivity(intent);   
                }
            }
        });
    }

    private void InitComponent() {
        userService= ApiUtlis.getUserService();
        listView=findViewById(R.id.list);
        imageView=findViewById(R.id.imageView1);
        textView=findViewById(R.id.textView1);
    }

    private void getFromIntent(){
        Bundle extras = getIntent().getExtras();
        if ((!extras.isEmpty())) {
            Flag= extras.getString("Flag");
            ShowData(Flag);
        }
        else {
            Toast.makeText(this, "Flag", Toast.LENGTH_SHORT).show();
        }
    }

    private void ShowData(String flag) {
        switch (flag)
        {
            case "Eg":
                imageView.setImageResource(R.mipmap.egypt);
                textView.setText("Egypt");
                getEgypt();
                break;
            case "It" :
                imageView.setImageResource(R.mipmap.roma);
                textView.setText("Italy");
                getItaly();
                break;
            case "Fr":
                textView.setText("France");
                imageView.setImageResource(R.mipmap.paris);
                getFrance();
                break;
            case "Us":
                textView.setText("US");
                imageView.setImageResource(R.mipmap.us);
                getUs();
                break;
            case "Ch" :
                textView.setText("China");
                imageView.setImageResource(R.mipmap.ch);
                getCha();
                break;
            case "Nu":
                textView.setText("Nederlanden");
                imageView.setImageResource(R.mipmap.nu);
                getNu();
                break;
        }
    }

    private void getNu() {
        Call<Example> call=userService.nl();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    listAdapter=new ListAdapter(ShowPlaces.this,response.body().getMonuments());
                    listView.setAdapter(listAdapter);
                }
                else {
                    Toast.makeText(ShowPlaces.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(ShowPlaces.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getEgypt() {
        Call<Example> call=userService.egypt();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    listAdapter=new ListAdapter(ShowPlaces.this,response.body().getMonuments());
                    listView.setAdapter(listAdapter);
                }
                else {
                    Toast.makeText(ShowPlaces.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(ShowPlaces.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getItaly() {
        Call<Example> call=userService.italya();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    listAdapter=new ListAdapter(ShowPlaces.this,response.body().getMonuments());
                    listView.setAdapter(listAdapter);
                }
                else {
                    Toast.makeText(ShowPlaces.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(ShowPlaces.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getFrance() {
        Call<Example> call=userService.franca();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    listAdapter=new ListAdapter(ShowPlaces.this,response.body().getMonuments());
                    listView.setAdapter(listAdapter);
                }
                else {
                    Toast.makeText(ShowPlaces.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(ShowPlaces.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getUs() {
        Call<Example> call=userService.us();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    listAdapter=new ListAdapter(ShowPlaces.this,response.body().getMonuments());
                    listView.setAdapter(listAdapter);
                }
                else {
                    Toast.makeText(ShowPlaces.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(ShowPlaces.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getCha() {
        Call<Example> call=userService.chaina();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    listAdapter=new ListAdapter(ShowPlaces.this,response.body().getMonuments());
                    listView.setAdapter(listAdapter);
                }
                else {
                    Toast.makeText(ShowPlaces.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(ShowPlaces.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
