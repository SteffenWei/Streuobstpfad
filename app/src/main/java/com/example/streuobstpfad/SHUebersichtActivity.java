package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SHUebersichtActivity extends AppCompatActivity {

    int punkteSpieler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_h_uebersicht);

        Intent intent = getIntent();
        punkteSpieler = intent.getIntExtra("punkte",0);

        ImageView sHUeIv1 = findViewById(R.id.sHUsIv1);
        TextView sHUeTv1 = findViewById(R.id.sHUsTv1);
        Button sHUeBtn1 = findViewById(R.id.sHUsBtn1);

        sHUeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShActivity();
            }
        });
    }
    public void openShActivity() {
        Intent intent = new Intent(this, SteinhaufenActivity.class);
        intent.putExtra("punkte", punkteSpieler);
        startActivity(intent);
    }

}
