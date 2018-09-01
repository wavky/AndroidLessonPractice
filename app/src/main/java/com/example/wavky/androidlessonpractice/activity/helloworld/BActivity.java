package com.example.wavky.androidlessonpractice.activity.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wavky.androidlessonpractice.R;

/**
 * Created on 2018/08/04
 *
 * @author Wavky.Huang
 */
public class BActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b);

        Button back = findViewById(R.id.backBtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("BActivity", "Back to AActivity.");
                Intent data = new Intent();
                data.putExtra("result", 999);
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}
