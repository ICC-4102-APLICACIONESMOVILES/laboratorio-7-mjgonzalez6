package com.example.mariajose.lab7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by MariaJose on 22-05-2018.
 */

public class hello extends Activity {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getBaseContext(), "Hello........", Toast.LENGTH_LONG).show();
    }
}
