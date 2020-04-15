package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HummelActivity extends AppCompatActivity {

    int punkteSpieler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hummel);

        Intent intent = getIntent();
        punkteSpieler = intent.getIntExtra("punkte",0);

        TextView huTv1 = findViewById(R.id.HuTv1);
        TextView huTv2 = findViewById(R.id.HuTv2);
        TextView huTv3 = findViewById(R.id.HuTv3);

        ImageView huIv1 = findViewById(R.id.HuIv1);

        Button huBtn1 = findViewById(R.id.HuBtn1);
        Button huBtn2 = findViewById(R.id.HuBtn2);

        huBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHuArtActivity();
            }
        });

    }

    public void openHuArtActivity(){
        Intent intent = new Intent(this, HummelArtenActivity.class);
        startActivity(intent);
    }

}
