package com.example.instagramproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    Context mycontext;
    String[] countryArray;

    MyAdapter(Context mycontext, String[] countryArray) {
        this.mycontext = mycontext;
        this.countryArray=countryArray;
    }

    @Override
    public int getCount() {
        return countryArray.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(mycontext).inflate(R.layout.item_spinner, null);
        TextView txtCountryName=view.findViewById(R.id.txtCountryName);

        txtCountryName.setText(countryArray[position]);
        return view;
    }
}
