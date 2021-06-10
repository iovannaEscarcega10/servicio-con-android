package com.example.myservice.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
    public void onCreate(){
        super.onCreate();
        Toast.makeText(this, "SE INICIÓ EL SERVICIO", Toast.LENGTH_SHORT).show();
    }
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "SE DETUVO EL SERVICIO", Toast.LENGTH_SHORT).show();
    }
}