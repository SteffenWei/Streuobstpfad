package com.example.streuobstpfad;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.provider.FontsContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class PuzzleActivity extends AppCompatActivity {

    int punkteSpieler;

    private ImageView ivp1,ivp2,ivp3,ivp4,ivp5,ivp6;
    public int auswahl = 1;

    private int[] arr = {0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        Intent intent = getIntent();
        punkteSpieler = intent.getIntExtra("punkte",0);

        ivp1 = findViewById(R.id.ivp1);
        ivp2 = findViewById(R.id.ivp2);
        ivp3 = findViewById(R.id.ivp3);
        ivp4 = findViewById(R.id.ivp4);
        ivp5 = findViewById(R.id.ivp5);
        ivp6 = findViewById(R.id.ivp6);

        Intent i = getIntent();
        final int number = i.getIntExtra("Bildnummer", 0);
        final int auswa = i.getIntExtra("numH",0);
        arr[0] = 0;
        arr[1] = i.getIntExtra("arr1",0);
        arr[2] = i.getIntExtra("arr2",0);
        arr[3] = i.getIntExtra("arr3",0);
        arr[4] = i.getIntExtra("arr4",0);
        arr[5] = i.getIntExtra("arr5",0);
        arr[6] = i.getIntExtra("arr6",0);

        // int number2 = i.getIntExtra("Bildnummer2", 0);
        // int number3 = i.getIntExtra("Bildnummer3", 0);
        // int number4 = i.getIntExtra("Bildnummer4", 0);
        // int number5 = i.getIntExtra("Bildnummer5", 0);
        // int number6 = i.getIntExtra("Bildnummer6", 0);

        ivp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auswahl = 1;
                Intent i = new Intent(PuzzleActivity.this, BilderPuzzleActivity.class);
                i.putExtra("numH", 1);

                i.putExtra("arr1",arr[1]);
                i.putExtra("arr2",arr[2]);
                i.putExtra("arr3",arr[3]);
                i.putExtra("arr4",arr[4]);
                i.putExtra("arr5",arr[5]);
                i.putExtra("arr6",arr[6]);

                startActivityForResult(i,0);
            }
        });

        ivp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auswahl = 2;
                Intent i = new Intent(PuzzleActivity.this, BilderPuzzleActivity.class);
                i.putExtra("numH", 2);

                i.putExtra("arr1",arr[1]);
                i.putExtra("arr2",arr[2]);
                i.putExtra("arr3",arr[3]);
                i.putExtra("arr4",arr[4]);
                i.putExtra("arr5",arr[5]);
                i.putExtra("arr6",arr[6]);

                startActivityForResult(i,0);
            }
        });

        ivp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auswahl = 3;
                Intent i = new Intent(PuzzleActivity.this, BilderPuzzleActivity.class);
                i.putExtra("numH", 3);

                i.putExtra("arr1",arr[1]);
                i.putExtra("arr2",arr[2]);
                i.putExtra("arr3",arr[3]);
                i.putExtra("arr4",arr[4]);
                i.putExtra("arr5",arr[5]);
                i.putExtra("arr6",arr[6]);

                startActivityForResult(i,0);
            }
        });

        ivp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auswahl = 4;
                Intent i = new Intent(PuzzleActivity.this, BilderPuzzleActivity.class);
                i.putExtra("numH", 4);

                i.putExtra("arr1",arr[1]);
                i.putExtra("arr2",arr[2]);
                i.putExtra("arr3",arr[3]);
                i.putExtra("arr4",arr[4]);
                i.putExtra("arr5",arr[5]);
                i.putExtra("arr6",arr[6]);

                startActivityForResult(i,0);
            }
        });

        ivp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auswahl = 5;
                Intent i = new Intent(PuzzleActivity.this, BilderPuzzleActivity.class);
                i.putExtra("numH", 5);

                i.putExtra("arr1",arr[1]);
                i.putExtra("arr2",arr[2]);
                i.putExtra("arr3",arr[3]);
                i.putExtra("arr4",arr[4]);
                i.putExtra("arr5",arr[5]);
                i.putExtra("arr6",arr[6]);

                startActivityForResult(i,0);
            }
        });

        ivp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auswahl = 6;
                Intent i = new Intent(PuzzleActivity.this, BilderPuzzleActivity.class);
                i.putExtra("numH", 6);

                i.putExtra("arr1",arr[1]);
                i.putExtra("arr2",arr[2]);
                i.putExtra("arr3",arr[3]);
                i.putExtra("arr4",arr[4]);
                i.putExtra("arr5",arr[5]);
                i.putExtra("arr6",arr[6]);

                startActivityForResult(i,0);
            }
        });

        arr[i.getIntExtra("numH",0)]= number;


        if(arr[1] == 1)
        {
            ivp1.setImageResource(R.drawable.ic_101);
        } else if (arr[1] == 2){
            ivp1.setImageResource(R.drawable.ic_102);
        } else if (arr[1] == 3){
            ivp1.setImageResource(R.drawable.ic_103);
        } else if (arr[1] == 4){
            ivp1.setImageResource(R.drawable.ic_104);
        } else if (arr[1] == 5){
            ivp1.setImageResource(R.drawable.ic_105);
        } else if (arr[1] == 6){
            ivp1.setImageResource(R.drawable.ic_106);
        }

        if(arr[2] == 1)
        {
            ivp2.setImageResource(R.drawable.ic_101);
        } else if (arr[2] == 2){
            ivp2.setImageResource(R.drawable.ic_102);
        } else if (arr[2] == 3){
            ivp2.setImageResource(R.drawable.ic_103);
        } else if (arr[2] == 4){
            ivp2.setImageResource(R.drawable.ic_104);
        } else if (arr[2] == 5){
            ivp2.setImageResource(R.drawable.ic_105);
        } else if (arr[2] == 6){
            ivp2.setImageResource(R.drawable.ic_106);
        }

        if(arr[3] == 1)
        {
            ivp3.setImageResource(R.drawable.ic_101);
        } else if (arr[3] == 2){
            ivp3.setImageResource(R.drawable.ic_102);
        } else if (arr[3] == 3){
            ivp3.setImageResource(R.drawable.ic_103);
        } else if (arr[3] == 4){
            ivp3.setImageResource(R.drawable.ic_104);
        } else if (arr[3] == 5){
            ivp3.setImageResource(R.drawable.ic_105);
        } else if (arr[3] == 6){
            ivp3.setImageResource(R.drawable.ic_106);
        }

        if(arr[4] == 1)
        {
            ivp4.setImageResource(R.drawable.ic_101);
        } else if (arr[4] == 2){
            ivp4.setImageResource(R.drawable.ic_102);
        } else if (arr[4] == 3){
            ivp4.setImageResource(R.drawable.ic_103);
        } else if (arr[4] == 4){
            ivp4.setImageResource(R.drawable.ic_104);
        } else if (arr[4] == 5){
            ivp4.setImageResource(R.drawable.ic_105);
        } else if (arr[4] == 6){
            ivp4.setImageResource(R.drawable.ic_106);
        }

        if(arr[5] == 1)
        {
            ivp5.setImageResource(R.drawable.ic_101);
        } else if (arr[5] == 2){
            ivp5.setImageResource(R.drawable.ic_102);
        } else if (arr[5] == 3){
            ivp5.setImageResource(R.drawable.ic_103);
        } else if (arr[5] == 4){
            ivp5.setImageResource(R.drawable.ic_104);
        } else if (arr[5] == 5){
            ivp5.setImageResource(R.drawable.ic_105);
        } else if (arr[5] == 6){
            ivp5.setImageResource(R.drawable.ic_106);
        }

        if(arr[6] == 1)
        {
            ivp6.setImageResource(R.drawable.ic_101);
        } else if (arr[6] == 2){
            ivp6.setImageResource(R.drawable.ic_102);
        } else if (arr[6] == 3){
            ivp6.setImageResource(R.drawable.ic_103);
        } else if (arr[6] == 4){
            ivp6.setImageResource(R.drawable.ic_104);
        } else if (arr[6] == 5){
            ivp6.setImageResource(R.drawable.ic_105);
        } else if (arr[6] == 6){
            ivp6.setImageResource(R.drawable.ic_106);
        }

        check();

        /*

        if(i.getIntExtra("numH",0)==1)
        {
            if(number == 1)
            {
                ivp1.setImageResource(R.drawable.ic_image101);
            } else if (number == 2){
                ivp1.setImageResource(R.drawable.ic_image102);
            } else if (number == 3){
                ivp1.setImageResource(R.drawable.ic_image103);
            } else if (number == 4){
                ivp1.setImageResource(R.drawable.ic_image104);
            } else if (number == 5){
                ivp1.setImageResource(R.drawable.ic_image105);
            } else if (number == 6){
                ivp1.setImageResource(R.drawable.ic_image106);
            }
        }
        if(i.getIntExtra("numH",0)==2)
        {
            if(number == 1)
            {
                ivp2.setImageResource(R.drawable.ic_image101);
            } else if (number == 2){
                ivp2.setImageResource(R.drawable.ic_image102);
            } else if (number == 3){
                ivp2.setImageResource(R.drawable.ic_image103);
            } else if (number == 4){
                ivp2.setImageResource(R.drawable.ic_image104);
            } else if (number == 5){
                ivp2.setImageResource(R.drawable.ic_image105);
            } else if (number == 6){
                ivp2.setImageResource(R.drawable.ic_image106);
            }
        }
        if(i.getIntExtra("numH",0)==3)
        {
            if(number == 1)
            {
                ivp3.setImageResource(R.drawable.ic_image101);
            } else if (number == 2){
                ivp3.setImageResource(R.drawable.ic_image102);
            } else if (number == 3){
                ivp3.setImageResource(R.drawable.ic_image103);
            } else if (number == 4){
                ivp3.setImageResource(R.drawable.ic_image104);
            } else if (number == 5){
                ivp3.setImageResource(R.drawable.ic_image105);
            } else if (number == 6){
                ivp3.setImageResource(R.drawable.ic_image106);
            }
        }
        if(i.getIntExtra("numH",0)==4)
        {
            if(number == 1)
            {
                ivp4.setImageResource(R.drawable.ic_image101);
            } else if (number == 2){
                ivp4.setImageResource(R.drawable.ic_image102);
            } else if (number == 3){
                ivp4.setImageResource(R.drawable.ic_image103);
            } else if (number == 4){
                ivp4.setImageResource(R.drawable.ic_image104);
            } else if (number == 5){
                ivp4.setImageResource(R.drawable.ic_image105);
            } else if (number == 6){
                ivp4.setImageResource(R.drawable.ic_image106);
            }
        }
        if(i.getIntExtra("numH",0)==5)
        {
            if(number == 1)
            {
                ivp5.setImageResource(R.drawable.ic_image101);
            } else if (number == 2){
                ivp5.setImageResource(R.drawable.ic_image102);
            } else if (number == 3){
                ivp5.setImageResource(R.drawable.ic_image103);
            } else if (number == 4){
                ivp5.setImageResource(R.drawable.ic_image104);
            } else if (number == 5){
                ivp5.setImageResource(R.drawable.ic_image105);
            } else if (number == 6){
                ivp5.setImageResource(R.drawable.ic_image106);
            }
        }
        if(i.getIntExtra("numH",0)==6)
        {
            if(number == 1)
            {
                ivp6.setImageResource(R.drawable.ic_image101);
            } else if (number == 2){
                ivp6.setImageResource(R.drawable.ic_image102);
            } else if (number == 3){
                ivp6.setImageResource(R.drawable.ic_image103);
            } else if (number == 4){
                ivp6.setImageResource(R.drawable.ic_image104);
            } else if (number == 5){
                ivp6.setImageResource(R.drawable.ic_image105);
            } else if (number == 6){
                ivp6.setImageResource(R.drawable.ic_image106);
            }
        }else {
           if(number == 1)
            {
                ivp1.setImageResource(R.drawable.up);
            } else if (number == 2){
                ivp1.setImageResource(R.drawable.up);
            } else if (number == 3){
                ivp1.setImageResource(R.drawable.up);
            } else if (number == 4){
                ivp1.setImageResource(R.drawable.up);
            } else if (number == 5){
                ivp1.setImageResource(R.drawable.up);
            } else if (number == 6){
                ivp1.setImageResource(R.drawable.up);
            }
        }*/

    }

    private void check() {

        if(ivp1.getDrawable().equals(R.drawable.ic_101) &&
                ivp2.getDrawable().equals(R.drawable.ic_102) &&
                ivp3.getDrawable().equals(R.drawable.ic_103) &&
                ivp4.getDrawable().equals(R.drawable.ic_104) &&
                ivp5.getDrawable().equals(R.drawable.ic_105) &&
                ivp6.getDrawable().equals(R.drawable.ic_106))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PuzzleActivity.this);
            alertDialogBuilder
                    .setMessage("Game Over!\n")
                    .setCancelable(false)
                    .setPositiveButton("New", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(),PuzzleActivity.class);
                            arr[0] = 0;
                            arr[1] = 0;
                            arr[2] = 0;
                            arr[3] = 0;
                            arr[4] = 0;
                            arr[5] = 0;
                            arr[6] = 0;
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }

}





