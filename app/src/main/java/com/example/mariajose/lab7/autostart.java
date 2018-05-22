package com.example.mariajose.lab7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by MariaJose on 22-05-2018.
 */

public class AutoStart extends BroadcastReceiver {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    public void onReceive(Context context, Intent arg1)
    {
        Intent intent = new Intent(context, MainActivity.class);
        context.startService(intent);
        Log.i("Autostart", "started");

    }




}
