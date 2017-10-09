package com.trkaynak.artbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView) findViewById(R.id.listView);

    }
    @Override//menu kullanılması için gereken metod
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.add_art,menu);//menüyü çıkartan kod

        return super.onCreateOptionsMenu(menu);
    }

    //menüye seçince ne işlem yapılacak
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.add_art){//add_art menüsü seçildi ise
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
