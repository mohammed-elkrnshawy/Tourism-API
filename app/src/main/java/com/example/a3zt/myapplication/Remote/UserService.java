package com.example.a3zt.myapplication.Remote;

import com.example.a3zt.myapplication.Classes.Example;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {


    @GET("api.php?action=search&format=json&srcountry=eg")
    Call<Example> egypt();

    @GET("api.php?action=search&format=json&srcountry=it")
    Call<Example> italya();

    @GET("api.php?action=search&format=json&srcountry=fr")
    Call<Example> franca();


    @GET("api.php?action=search&format=json&srcountry=nl")
    Call<Example> nl();

    @GET("api.php?action=search&format=json&srcountry=cn")
    Call<Example> chaina();

    @GET("api.php?action=search&format=json&srcountry=us")
    Call<Example> us();


}
