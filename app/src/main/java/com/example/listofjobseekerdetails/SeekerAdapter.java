package com.example.listofjobseekerdetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SeekerAdapter extends BaseAdapter {
    Context context;
    String seekerDetails[];
    int icons[];
    LayoutInflater inflter;

    public SeekerAdapter(Context applicationContext, String[] countryList, int[] flags) {
        this.context = context;
        this.seekerDetails = countryList;
        this.icons = icons;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return seekerDetails.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icons);
        country.setText(seekerDetails[i]);
        icon.setImageResource(icons[i]);
        return view;
    }

}
