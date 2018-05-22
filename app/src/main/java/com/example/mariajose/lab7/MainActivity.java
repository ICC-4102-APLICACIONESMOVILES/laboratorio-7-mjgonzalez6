package com.example.mariajose.lab7;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int UPLOAD_NOTIFICATION_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void genarateNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "channelId").
                setSmallIcon(R.drawable.ic_launcher_background).setContentTitle("Alarma").setContentText("Alarma sonanado");

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(UPLOAD_NOTIFICATION_ID, builder.build());

    }
}
