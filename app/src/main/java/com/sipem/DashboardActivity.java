package com.sipem;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class DashboardActivity extends AppCompatActivity{

    private TextView tampilnama;
    Button peminjaman;
    Button detail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        tampilnama=findViewById(R.id.tampilnama);
        peminjaman=(Button)findViewById(R.id.bt_peminjam);
        detail=(Button)findViewById(R.id.bt_detail);

        registerForContextMenu(detail);

        String username = getIntent().getStringExtra("username");

        tampilnama.setText("Hallo, "+username);

        peminjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this,FormPeminjaman.class);
                startActivity(intent);
            }
        });

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this,EksekusiMenu.class);
                startActivity(intent);
            }
        });
    }


}
