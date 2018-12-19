package com.example.pavel.service;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

@SuppressLint("Registered")
public class Service extends android.app.Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast toast = Toast.makeText(this, "Begin of service", Toast.LENGTH_SHORT);
        toast.show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast toast = Toast.makeText(this, "End of service", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
