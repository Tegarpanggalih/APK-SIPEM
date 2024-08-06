package com.sipem;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FormPeminjaman extends AppCompatActivity {
    private EditText NIK;
    private EditText Nama;
    private RadioButton LakiLaki;
    private RadioButton Perempuan;
    private EditText NOhp;
    private Spinner Merk;
    private EditText Mobil;
    private EditText Lama_Sewa;

    private Button proses,proses2;

    private ArrayAdapter<String> adapter;
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halpinjam);

        NIK = findViewById(R.id.nik);
        Nama = findViewById(R.id.nama);
        LakiLaki = findViewById(R.id.rdb1);
        Perempuan = findViewById(R.id.rdb2);
        NOhp = findViewById(R.id.nohp);
        Merk = findViewById(R.id.merk);
        Mobil = findViewById(R.id.nama_mobil);
        proses = findViewById(R.id.bt_proses);
        Lama_Sewa = findViewById(R.id.lama_sewa);

        data = new ArrayList<>();
        data.add("Honda");
        data.add("Toyota");
        data.add("Mitsubishi");
        data.add("Suzuki");
        data.add("Daihatsu");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Merk.setAdapter(adapter);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jenisKelamin;
                if (LakiLaki.isChecked()) {
                    jenisKelamin = "Laki-laki";
                } else if (Perempuan.isChecked()) {
                    jenisKelamin = "Perempuan";
                } else {
                    jenisKelamin = "";
                }

                String merekmobil = Merk.getSelectedItem().toString();
                int harga = HargaperHari(merekmobil);
                int lamasewa = Integer.parseInt(Lama_Sewa.getText().toString());
                int total = harga * lamasewa;

                Intent intent = new Intent(FormPeminjaman.this, DetailPinjam.class);
                intent.putExtra("NIK", NIK.getText().toString());
                intent.putExtra("Nama", Nama.getText().toString());
                intent.putExtra("NOhp", NOhp.getText().toString());
                intent.putExtra("Mobil", Mobil.getText().toString());
                intent.putExtra("Merk", merekmobil);
                intent.putExtra("JenisKelamin", jenisKelamin);
                intent.putExtra("LamaSewa", lamasewa);
                intent.putExtra("Total", total);

                startActivity(intent);

                Toast.makeText(FormPeminjaman.this,"berhasil diklik",Toast.LENGTH_SHORT);
            }
        });

    }

    private int HargaperHari(String Merk) {
        switch (Merk) {
            case "Honda":
                return 500000;
            case "Toyota":
                return 400000;
            case "Mitsubishi":
                return 300000;
            case "Suzuki":
                return 200000;
            case "Daihatsu":
                return 100000;
            default:
                return 0;
        }
    }
}
