package com.smalldolphin.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyFirstAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}