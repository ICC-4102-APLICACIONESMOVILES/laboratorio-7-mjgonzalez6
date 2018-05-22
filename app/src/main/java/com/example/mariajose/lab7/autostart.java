package com.example.mariajose.lab7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by MariaJose on 22-05-2018.
 */

public class autostart extends BroadcastReceiver {

    public void onReceive(Context context, Intent arg1)
    {
        Intent intent = new Intent(context,service.class);
        context.startService(intent);
        Log.i("Autostart", "started");
    }

}
