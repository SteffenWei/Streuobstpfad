package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BilderActivity.class);
                startActivity(i);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // return super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id== R.id.Main){
            Intent intent=new Intent( this,MainActivity.class);
            Toast.makeText(this, "click on Main Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }

        if(id== R.id.settings){
            Intent intent=new Intent( this,settingActivity.class);
            Toast.makeText(this, "click on setting Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }

        if(id== R.id.search){
            Intent intent=new Intent( this, searchActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Search Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.felsberg){
            Intent intent=new Intent(this, steinhaufenActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on FelsBerg Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.hoch_stamm){
            Intent intent=new Intent(this, hochStammActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Der Hochstamm Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.fr_brummer){
            Intent intent=new Intent(this, frBrummerActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Friedliche Brummer Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.schleiereule){
            Intent intent=new Intent(this, schleiereuleActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Die Schleiereule Activity", Toast.LENGTH_LONG).show();
            return true;
        }
        if(id== R.id.quiz){
            Intent intent=new Intent( this,QuizActivity.class);
            Toast.makeText(this, "click on Das Quiz Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }
        if(id== R.id.puzzle){
            Intent intent=new Intent( this,PuzzleActivity.class);
            Toast.makeText(this, "click on Das Puzzle Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }
        if(id== R.id.memory){
            Intent intent=new Intent( this,MemoryActivity.class);
            Toast.makeText(this, "click on Das Memory Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
