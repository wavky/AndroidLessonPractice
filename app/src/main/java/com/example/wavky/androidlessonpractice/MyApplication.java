package com.example.wavky.androidlessonpractice;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Log.e("Application", activity.getLocalClassName() + " onCreated.");
            }

            @Override
            public void onActivityStarted(Activity activity) {

                Log.e("Application", activity.getLocalClassName() + " onStart.");
            }

            @Override
            public void onActivityResumed(Activity activity) {

                Log.e("Application", activity.getLocalClassName() + " onResume.");
            }

            @Override
            public void onActivityPaused(Activity activity) {

                Log.e("Application", activity.getLocalClassName() + " onPause.");
            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
