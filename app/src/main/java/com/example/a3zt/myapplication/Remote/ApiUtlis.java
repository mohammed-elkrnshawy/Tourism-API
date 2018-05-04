package com.example.a3zt.myapplication.Remote;

public class ApiUtlis {
    public static final String Base_Url="https://tools.wmflabs.org/heritage/api/";

    public static UserService getUserService()
    {
        return RetrofitClient.getClient(Base_Url).create(UserService.class);
    }
}
