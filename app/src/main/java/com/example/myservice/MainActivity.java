package com.example.myservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_start, btn_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start:
                break;
            case R.id.btn_stop:
                break;
            default:break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}