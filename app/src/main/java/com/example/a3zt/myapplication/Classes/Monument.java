package com.example.a3zt.myapplication.Classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Monument implements Serializable {
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("project")
    @Expose
    private String project;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("adm0")
    @Expose
    private String adm0;
    @SerializedName("adm1")
    @Expose
    private Object adm1;
    @SerializedName("adm2")
    @Expose
    private Object adm2;
    @SerializedName("adm3")
    @Expose
    private Object adm3;
    @SerializedName("adm4")
    @Expose
    private Object adm4;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("municipality")
    @Expose
    private String municipality;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("commonscat")
    @Expose
    private String commonscat;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("monument_article")
    @Expose
    private String monumentArticle;
    @SerializedName("wd_item")
    @Expose
    private Object wdItem;
    @SerializedName("registrant_url")
    @Expose
    private String registrantUrl;
    @SerializedName("changed")
    @Expose
    private String changed;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdm0() {
        return adm0;
    }

    public void setAdm0(String adm0) {
        this.adm0 = adm0;
    }

    public Object getAdm1() {
        return adm1;
    }

    public void setAdm1(Object adm1) {
        this.adm1 = adm1;
    }

    public Object getAdm2() {
        return adm2;
    }

    public void setAdm2(Object adm2) {
        this.adm2 = adm2;
    }

    public Object getAdm3() {
        return adm3;
    }

    public void setAdm3(Object adm3) {
        this.adm3 = adm3;
    }

    public Object getAdm4() {
        return adm4;
    }

    public void setAdm4(Object adm4) {
        this.adm4 = adm4;
    }

    public String getName() {
        if(name.contains("|")){
           return name.substring(0,name.indexOf('|'));
        }
        else
        {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCommonscat() {
        return commonscat;
    }

    public void setCommonscat(String commonscat) {
        this.commonscat = commonscat;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMonumentArticle() {
        return monumentArticle;
    }

    public void setMonumentArticle(String monumentArticle) {
        this.monumentArticle = monumentArticle;
    }

    public Object getWdItem() {
        return wdItem;
    }

    public void setWdItem(Object wdItem) {
        this.wdItem = wdItem;
    }

    public String getRegistrantUrl() {
        return registrantUrl;
    }

    public void setRegistrantUrl(String registrantUrl) {
        this.registrantUrl = registrantUrl;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

}

