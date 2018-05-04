package com.example.a3zt.myapplication.Classes;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a3zt.myapplication.R;


import java.util.List;


public class ListAdapter extends BaseAdapter {
    Context context;
    List<Monument> monuments;


    public ListAdapter(Context context, List<Monument> monuments)
    {
        this.context=context;
        this.monuments = monuments;
    }

    @Override
    public int getCount() {
        return monuments.size();
    }

    @Override
    public Object getItem(int i) {
       return monuments.get(i);
    }

    @Override
    public long getItemId(int i) {
        return monuments.indexOf(getItem(i));
    }

    class ViewHolder
    {

        TextView name;
        TextView location;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder=null;

        LayoutInflater mIFlater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        View row=mIFlater.inflate(R.layout.view,viewGroup,false);

        holder=new ViewHolder();

        holder.name=row.findViewById(R.id.name);
        holder.location= row.findViewById(R.id.loc);


        holder.name.setText(monuments.get(i).getName().replace("[[","").replace("]]",""));
        holder.location.setText(monuments.get(i).getMunicipality().replace("[[","").replace("]]",""));



        return row;
    }
}
