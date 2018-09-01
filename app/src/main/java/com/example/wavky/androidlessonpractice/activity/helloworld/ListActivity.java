package com.example.wavky.androidlessonpractice.activity.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.wavky.androidlessonpractice.R;
import com.example.wavky.androidlessonpractice.adapter.MyBaseAdapter;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);
        ListView dataList = findViewById(R.id.dataList);

        String[] data = {
                "abc","efg","xyz", "123","456",
                "789","007","008","233", "佛山",
                "广东", "中国", "日本", "东京", "IT-Future",
                "Android", "半天跟团游", "第三站","over"
        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_list_item_1, data
//        );

        dataList.setAdapter(new MyBaseAdapter(this, data));
    }
}
