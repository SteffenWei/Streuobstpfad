package com.example.streuobstpfad;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    Button antwort1, antwort2, antwort3, antwort4;

    TextView score, frage;

    private Fragen mFragen = new Fragen();

    private String mAntworten;
    private int mScore = 0;
    private int mFragenLaenge = mFragen.mFragen.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        antwort1 = (Button) findViewById(R.id.antwort1);
        antwort2 = (Button) findViewById(R.id.antwort2);
        antwort3 = (Button) findViewById(R.id.antwort3);
        antwort4 = (Button) findViewById(R.id.antwort4);

        score = (TextView) findViewById(R.id.score);
        frage = (TextView) findViewById(R.id.frage);

        score.setText("Score " + mScore);

        updateFragen(r.nextInt(mFragenLaenge));

        antwort1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(antwort1.getText() == mAntworten){
                    mScore++;
                    score.setText("Score " + mScore);
                    updateFragen(r.nextInt(mFragenLaenge));
                } else {
                    gameOver();
                }

            }
        });

        antwort2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(antwort2.getText() == mAntworten){
                    mScore++;
                    score.setText("Score " + mScore);
                    updateFragen(r.nextInt(mFragenLaenge));
                } else {
                    gameOver();
                }
            }
        });
        antwort3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(antwort3.getText() == mAntworten){
                    mScore++;
                    score.setText("Score " + mScore);
                    updateFragen(r.nextInt(mFragenLaenge));
                } else {
                    gameOver();
                }

            }
        });
        antwort4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(antwort4.getText() == mAntworten){
                    mScore++;
                    score.setText("Score " + mScore);
                    updateFragen(r.nextInt(mFragenLaenge));
                } else {
                    gameOver();
                }

            }
        });
    }

    private void updateFragen(int num) {
        frage.setText(mFragen.getFrage(num));
        antwort1.setText(mFragen.getAntworten1(num));
        antwort2.setText(mFragen.getAntworten2(num));
        antwort3.setText(mFragen.getAntworten3(num));
        antwort4.setText(mFragen.getAntworten4(num));

        mAntworten = mFragen.getRichtigeAntwort(num);

    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setMessage("Game Over. Dein Score ist " + mScore + "Punkte.")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),QuizActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                });


    }
}
