package com.romanprisyazhnuk.ortandroid1st;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.locks.Lock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        TextView t = (TextView) findViewById(R.id.textViewForResult) ;
        t.setText(intent.getStringExtra("data"));
    }

    public void buttonToSecondActOnclick(View v) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);

    }

    public void buttonNotificationOnclick(View v) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                     //   .setSmallIcon(R.drawable.piggy)
                        .setContentTitle("Second Activity")
                        .setContentText("Click on This Notification");

        Intent resultIntent = new Intent(MainActivity.this, SecondActivity.class);

        PendingIntent resultPendingIntent = PendingIntent.getActivity(this, 0, resultIntent,
                PendingIntent.FLAG_UPDATE_CURRENT );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
    }
}
