package com.example.wavky.androidlessonpractice.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class IndexAdapter extends BaseAdapter {

    private Activity activity;
    private Class[] data;

    public IndexAdapter(Activity activity, Class[] activities) {
        this.activity = activity;
        this.data = activities;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = activity.getLayoutInflater().inflate(
                    android.R.layout.simple_list_item_1,
                    null);
        }

        ((TextView) convertView).setText(((Class) getItem(position)).getSimpleName());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.startActivity(new Intent(activity, (Class) getItem(position)));
            }
        });
        return convertView;
    }
}
