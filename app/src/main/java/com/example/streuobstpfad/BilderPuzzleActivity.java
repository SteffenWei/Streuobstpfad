
package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BilderPuzzleActivity extends AppCompatActivity {

    private ImageView ivbp1,ivbp2,ivbp3,ivbp4,ivbp5,ivbp6;
    private int mArr[] = {0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilder_puzzle);

        ivbp1 = findViewById(R.id.ivpb1);
        ivbp2 = findViewById(R.id.ivpb2);
        ivbp3 = findViewById(R.id.ivpb3);
        ivbp4 = findViewById(R.id.ivpb4);
        ivbp5 = findViewById(R.id.ivpb5);
        ivbp6 = findViewById(R.id.ivpb6);

        Intent in = getIntent();
        final int auswahl = in.getIntExtra("numH",0);

        mArr[1] = in.getIntExtra("arr1",0);
        mArr[2] = in.getIntExtra("arr2",0);
        mArr[3] = in.getIntExtra("arr3",0);
        mArr[4] = in.getIntExtra("arr4",0);
        mArr[5] = in.getIntExtra("arr5",0);
        mArr[6] = in.getIntExtra("arr6",0);


        ivbp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 1 ;
                Intent i = new Intent(BilderPuzzleActivity.this, PuzzleActivity.class);
                i.putExtra("Bildnummer", number);
                i.putExtra("numH",auswahl);

                i.putExtra("arr1",mArr[1]);
                i.putExtra("arr2",mArr[2]);
                i.putExtra("arr3",mArr[3]);
                i.putExtra("arr4",mArr[4]);
                i.putExtra("arr5",mArr[5]);
                i.putExtra("arr6",mArr[6]);

                startActivityForResult(i,1);
            }
        });

        ivbp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 2 ;
                Intent i = new Intent(BilderPuzzleActivity.this, PuzzleActivity.class);
                i.putExtra("Bildnummer", number);
                i.putExtra("numH",auswahl);

                i.putExtra("arr1",mArr[1]);
                i.putExtra("arr2",mArr[2]);
                i.putExtra("arr3",mArr[3]);
                i.putExtra("arr4",mArr[4]);
                i.putExtra("arr5",mArr[5]);
                i.putExtra("arr6",mArr[6]);

                startActivityForResult(i,2);
            }
        });

        ivbp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 3 ;
                Intent i = new Intent(BilderPuzzleActivity.this, PuzzleActivity.class);
                i.putExtra("Bildnummer", number);
                i.putExtra("numH",auswahl);

                i.putExtra("arr1",mArr[1]);
                i.putExtra("arr2",mArr[2]);
                i.putExtra("arr3",mArr[3]);
                i.putExtra("arr4",mArr[4]);
                i.putExtra("arr5",mArr[5]);
                i.putExtra("arr6",mArr[6]);

                startActivityForResult(i,3);
            }
        });

        ivbp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 4 ;
                Intent i = new Intent(BilderPuzzleActivity.this, PuzzleActivity.class);
                i.putExtra("Bildnummer", number);
                i.putExtra("numH",auswahl);

                i.putExtra("arr1",mArr[1]);
                i.putExtra("arr2",mArr[2]);
                i.putExtra("arr3",mArr[3]);
                i.putExtra("arr4",mArr[4]);
                i.putExtra("arr5",mArr[5]);
                i.putExtra("arr6",mArr[6]);

                startActivityForResult(i,4);
            }
        });

        ivbp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 5 ;
                Intent i = new Intent(BilderPuzzleActivity.this, PuzzleActivity.class);
                i.putExtra("Bildnummer", number);
                i.putExtra("numH",auswahl);

                i.putExtra("arr1",mArr[1]);
                i.putExtra("arr2",mArr[2]);
                i.putExtra("arr3",mArr[3]);
                i.putExtra("arr4",mArr[4]);
                i.putExtra("arr5",mArr[5]);
                i.putExtra("arr6",mArr[6]);

                startActivityForResult(i,5);
            }
        });

        ivbp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 6 ;
                Intent i = new Intent(BilderPuzzleActivity.this, PuzzleActivity.class);
                i.putExtra("Bildnummer", number);
                i.putExtra("numH",auswahl);
                startActivityForResult(i,6);
            }
        });

    }
}