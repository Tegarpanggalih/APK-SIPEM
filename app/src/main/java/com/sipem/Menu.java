package com.sipem;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.honda){
            honda();
            return true;
        } else if (item.getItemId()==R.id.toyota) {
            toyota();
            return true;
        } else if (item.getItemId()==R.id.mitsubishi) {
            mitsubishi();
            return true;
        }else if (item.getItemId()==R.id.suzuki) {
            suzuki();
            return true;
        }else if (item.getItemId()==R.id.daihatsu) {
            daihatsu();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void honda(){
        Toast.makeText(this, "Selamat Datang di Menu Honda",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(DashboardActivity.this,Honda.class);
//        startActivity(intent);
    }
    public void toyota(){
        Toast.makeText(this, "Selamat Datang di Menu Toyota",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(DashboardActivity.this,Toyota.class);
//        startActivity(intent);
    }
    public void mitsubishi(){
        Toast.makeText(this, "Selamat Datang di Menu Mitsubishi",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(DashboardActivity.this,Mitsubishi.class);
//        startActivity(intent);
    }
    public void suzuki(){
        Toast.makeText(this, "Selamat Datang di Menu Suzuki",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(DashboardActivity.this,Suzuki.class);
//        startActivity(intent);
    }
    public void daihatsu(){
        Toast.makeText(this, "Selamat Datang di Menu Daihatsu",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(DashboardActivity.this,Daihatsu.class);
//        startActivity(intent);
    }
}
