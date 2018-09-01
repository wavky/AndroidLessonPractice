package com.example.wavky.androidlessonpractice.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.wavky.androidlessonpractice.R;

public class MyBaseAdapter extends BaseAdapter {

    private Activity activity;
    private String[] data;

    public MyBaseAdapter(Activity activity, String[] data){
        this.activity = activity;
        this.data = data;
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
        if(convertView == null) {
            convertView = activity.getLayoutInflater().inflate(R.layout.listitem,
                    null);
            ViewHolder holder = new ViewHolder(
                    convertView.findViewById(R.id.text1),
                    convertView.findViewById(R.id.text2)
            );
            convertView.setTag(holder);
        }

        ((ViewHolder)convertView.getTag()).text1.setText(Integer.toString(position));
        ((ViewHolder)convertView.getTag()).text2.setText(getItem(position).toString());

        return convertView;
    }

    class ViewHolder{
        TextView text1;
        TextView text2;

        public ViewHolder(View view1, View view2){
            text1 = (TextView)view1;
            text2 = (TextView)view2;
        }
    }

}