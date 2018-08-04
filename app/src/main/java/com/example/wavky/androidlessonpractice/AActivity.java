package com.example.wavky.androidlessonpractice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created on 2018/08/04
 *
 * @author Wavky.Huang
 */
public class AActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("AActivity", "onCreate");

        setContentView(R.layout.activity_a);

        Button next = findViewById(R.id.nextBtn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("AActivity", "Going to BActivity.");

                Toast.makeText(AActivity.this,
                        "Going to BActivity.",
                        Toast.LENGTH_LONG)
                        .show();

                AlertDialog dialog = new AlertDialog.Builder(AActivity.this)
                        .setTitle("Warning")
                        .setMessage("Do you want to go to BActivity?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(AActivity.this, BActivity.class));
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("AActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("AActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("AActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("AActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("AActivity", "onDestroy");
    }
}
