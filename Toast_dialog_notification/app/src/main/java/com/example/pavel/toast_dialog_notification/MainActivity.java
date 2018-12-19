package com.example.pavel.toast_dialog_notification;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lookToast(View view){
       Toast toast = Toast.makeText(this, "Hello toast", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void LookNorification(View view){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "simple_notification");
        builder.setContentTitle("Notification");
        builder.setContentText("This first notification");
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1, builder.build());
    }

    public void lookDialog(View view){
        DialogCreate dialogCreate = new DialogCreate();
        dialogCreate.show(getSupportFragmentManager(), "dialog");
    }
}
