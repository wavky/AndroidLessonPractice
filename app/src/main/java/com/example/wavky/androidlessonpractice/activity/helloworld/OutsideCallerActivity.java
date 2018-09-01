package com.example.wavky.androidlessonpractice.activity.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wavky.androidlessonpractice.R;

public class OutsideCallerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_outside_caller);

        Button mail = findViewById(R.id.mail);
        Button sms = findViewById(R.id.sms);
        Button phoneCall = findViewById(R.id.phoneCall);
        Button web = findViewById(R.id.web);
        Button map = findViewById(R.id.map);

        Uri telUri = Uri.parse("tel:" + 110); //拨号程序
        Uri smsUri = Uri.parse("smsto:" + 110); //短信
        Uri mailtoUri = Uri.parse("mailto:" + "110@china"); //邮件
        Uri webUri = Uri.parse("http://www.baidu.com"); //浏览器
        Uri mapUri = Uri.parse("geo:"+"38.383838,383.383838"); //地图定位

        phoneCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, telUri);
                startActivity(intent);
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, smsUri);
                startActivity(intent);
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, mailtoUri);
                startActivity(intent);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, webUri);
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, mapUri);
                startActivity(intent);
            }
        });
    }
}
