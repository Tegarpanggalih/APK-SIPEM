package com.sipem;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailPinjam extends AppCompatActivity {

    private TextView NIK, Nama, NOHP, Merk, Mobil, Sewa, Total, jenisKelamin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haldetpinjam);

        NIK = findViewById(R.id.tampilnik);
        Nama = findViewById(R.id.tampilnama);
        jenisKelamin = findViewById(R.id.tampiljeniskelamin);
        NOHP = findViewById(R.id.tampilno);
        Merk = findViewById(R.id.tampilmerk);
        Mobil = findViewById(R.id.tampilmobil);
        Sewa = findViewById(R.id.tampilsewa);
        Total = findViewById(R.id.total);

        String nik = getIntent().getStringExtra("NIK");
        String nama = getIntent().getStringExtra("Nama");
        String JenisKelamin = getIntent().getStringExtra("JenisKelamin");
        String nohp = getIntent().getStringExtra("NOhp");
        String merk = getIntent().getStringExtra("Merk");
        String mobil = getIntent().getStringExtra("Mobil");
        int lamaSewa = getIntent().getIntExtra("LamaSewa", 1);
        int totalBiaya = getIntent().getIntExtra("Total", 0);

        NIK.setText("NIK: " + nik);
        Nama.setText("Nama: " + nama);
        jenisKelamin.setText("Jenis Kelamin : " + JenisKelamin);
        NOHP.setText("NoHp: " + nohp);
        Merk.setText("Merk Mobil: " + merk);
        Mobil.setText("Mobil: " + mobil);
        Sewa.setText("Lama Sewa: " + lamaSewa);
        Total.setText("Total Biaya: Rp." + totalBiaya);
    }
}
