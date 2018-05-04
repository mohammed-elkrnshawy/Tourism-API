package com.example.a3zt.myapplication.Classes;

import com.example.a3zt.myapplication.Classes.Continue;
import com.example.a3zt.myapplication.Classes.Monument;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("monuments")
    @Expose
    private List<Monument> monuments = null;
    @SerializedName("continue")
    @Expose
    private Continue _continue;

    public List<Monument> getMonuments() {
        return monuments;
    }

    public void setMonuments(List<Monument> monuments) {
        this.monuments = monuments;
    }

    public Continue getContinue() {
        return _continue;
    }

    public void setContinue(Continue _continue) {
        this._continue = _continue;
    }

}