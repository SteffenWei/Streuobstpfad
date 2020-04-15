package com.example.streuobstpfad;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HummelArtenActivity extends AppCompatActivity {

    int punkteSpieler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hummel_arten);

        Intent intent = getIntent();
        punkteSpieler = intent.getIntExtra("punkte",0);

        TextView huUeTv1 = findViewById(R.id.HuUeTv1);
        Button huUeBtn1 = findViewById(R.id.HuUeBtn1);

        ImageView iv_background = findViewById(R.id.iv_background);
        AnimationDrawable humslideshow = (AnimationDrawable) iv_background.getDrawable();
        humslideshow.start();

        huUeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHuActivity();
            }
        });

    }

    public void openHuActivity(){
        Intent intent = new Intent(this, HummelActivity.class);
        startActivity(intent);
    }
}
