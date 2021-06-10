package com.example.myservice.MyTask;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.myservice.MainActivity;
import com.example.myservice.Services.MyService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTask extends AsyncTask<String, String, String> {
    private DateFormat dateFormat;
    private String date;
    private boolean cent;
    private Context mContext;

    public MyTask(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        cent = true;
    }
    @Override
    protected String doInBackground(String... strings) {
        while (cent){
            date = dateFormat.format(new Date());
            try {
                publishProgress(date);
                // Stop 5s
                Thread.sleep(5000);
                Log.e("Progreso:", "kiubo" + cent);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    @Override
    protected void onProgressUpdate(String... values) {
        Toast.makeText(mContext, "Hora actual: " + values[0], Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        cent = false;
    }
}

//que numero mandó el mensaje, ver el mensaje
