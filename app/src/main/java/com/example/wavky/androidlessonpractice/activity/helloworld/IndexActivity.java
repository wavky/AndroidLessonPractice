package com.example.wavky.androidlessonpractice.activity.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.wavky.androidlessonpractice.R;
import com.example.wavky.androidlessonpractice.adapter.IndexAdapter;

import org.jetbrains.annotations.Nullable;

public class IndexActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_index);
        ListView indexList = findViewById(R.id.indexList);

        Class[] activities = {
                AActivity.class,
                QuestionnaireActivity.class,
                ListActivity.class,
                OutsideCallerActivity.class
        };

        indexList.setAdapter(new IndexAdapter(this, activities));
    }
}
