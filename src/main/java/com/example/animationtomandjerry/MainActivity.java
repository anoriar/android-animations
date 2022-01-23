package com.example.animationtomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void eraseTom(View view) {
        ImageView tomImage = findViewById(R.id.tomCatImage);
        ImageView jerryImage = findViewById(R.id.jerryMouseImage);
        if(isTomVisible){
            tomImage.animate().rotation(0).scaleX(0).scaleY(0).setDuration(2000);
            jerryImage.animate().rotation(3600).scaleX(1).scaleY(1).setDuration(2000);
            isTomVisible = false;
        }else{
            tomImage.animate().rotation(3600).scaleX(1).scaleY(1).setDuration(2000);
            jerryImage.animate().rotation(0).scaleX(0).scaleY(0).setDuration(2000);
            isTomVisible = true;
        }
    }
}