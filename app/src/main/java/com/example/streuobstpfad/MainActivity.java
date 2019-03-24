package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
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
        if(id== R.id.settings){
            Intent intent=new Intent( this,settingActivity.class);
            Toast.makeText(this, "click on setting Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }

        if(id== R.id.search){
            Intent intent=new Intent( this,scarchActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Search Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.Thema1){
            Intent intent=new Intent(this,felsbergActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on FelsBerg Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        TextView etZaehler = findViewById(R.id.txtzaehler);
        TextView etNenner = findViewById(R.id.txtnenner);

        String sz = etZaehler.getText().toString();
        String sn = etNenner.getText().toString();

        if (sz.length() == 0 || sn.length() == 0)
            return;

        int z = Integer.parseInt(sz); int n = Integer.parseInt(sn);
        if (z*n != 0) { int rest;
            int ggt = Math.abs(z);
            int divisor = Math.abs(n); do {
                rest = ggt % divisor;
                ggt = divisor;
                divisor = rest;
            } while (rest > 0); z /= ggt;
            n /= ggt;
        }


        etZaehler.setText(Integer.toString(z));
        etNenner.setText(Integer.toString(n));

    }
}
