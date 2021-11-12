package com.danial.badi;

import androidx.appcompat.app.AppCompatActivity;
import ir.notopia.android.ShelfsActivity;
import ir.notopia.android.ar.ARActivity;
import ir.notopia.android.ar.DownloadArActivity;
import ir.notopia.android.verification.EnterNumberActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnClick);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentShelf = new Intent(MainActivity.this, DownloadArActivity.class);
                startActivity(intentShelf);
            }
        });


    }
}