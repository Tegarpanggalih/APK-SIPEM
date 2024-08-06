package com.sipem;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EksekusiMenu extends AppCompatActivity {
    TextView context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detailmobil);

        context=findViewById(R.id.tv_context);
        registerForContextMenu(context);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu,menu);
    }
    public void honda(){
        Intent intent = new Intent(EksekusiMenu.this,Honda.class);
        startActivity(intent);
    }
    public void toyota(){

        Intent intent = new Intent(EksekusiMenu.this,Toyota.class);
        startActivity(intent);
    }
    public void mitsubishi(){

        Intent intent = new Intent(EksekusiMenu.this,Mitsubishi.class);
        startActivity(intent);
    }
    public void suzuki(){

        Intent intent = new Intent(EksekusiMenu.this,Suzuki.class);
        startActivity(intent);
    }
    public void daihatsu(){

        Intent intent = new Intent(EksekusiMenu.this,Daihatsu.class);
        startActivity(intent);
    }

    @Override

    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.honda:
                honda();
                return true;

            case R.id.toyota:
                toyota();
                return true;

            case R.id.mitsubishi:
                mitsubishi();
                return true;

            case R.id.suzuki:
                suzuki();
                return true;

            case R.id.daihatsu:
                daihatsu();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}
