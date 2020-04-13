package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlussActivity extends AppCompatActivity {

    int punkteSpieler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluss);

        Intent intent = getIntent();
        punkteSpieler = intent.getIntExtra("punkte",0);

    }
}
