package com.example.a3zt.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.a3zt.myapplication.Classes.Example;
import com.example.a3zt.myapplication.Remote.ApiUtlis;
import com.example.a3zt.myapplication.Remote.UserService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TTTTTTTT extends AppCompatActivity {
    private UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_country);

        userService= ApiUtlis.getUserService();


        Call<Example> call=userService.egypt();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful())
                {
                    Toast.makeText(TTTTTTTT.this, response.body().getMonuments().get(0).getName(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TTTTTTTT.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("AAAA",t.getMessage());
                Toast.makeText(TTTTTTTT.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }





}
