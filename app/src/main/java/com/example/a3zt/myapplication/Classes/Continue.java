package com.example.a3zt.myapplication.Classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Continue {
    @SerializedName("srcontinue")
    @Expose
    private String srcontinue;

    public String getSrcontinue() {
        return srcontinue;
    }

    public void setSrcontinue(String srcontinue) {
        this.srcontinue = srcontinue;
    }


}