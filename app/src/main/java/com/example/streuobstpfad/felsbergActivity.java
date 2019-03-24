package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class felsbergActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felsberg);
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

        if(id== R.id.Thema1){
            Intent intent=new Intent(this,felsbergActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on FelsBerg Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
