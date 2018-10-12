package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_pesg(View view){
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(Dashboard.this, Segitiga.class);
        startActivity(sgt);
    }
    public void btn_jajar(View view) {
        Intent jjr = new Intent(Dashboard.this, JajarGenjang.class);
        startActivity(jjr);
    }
    public void btn_bk(View view){
        Intent bk = new Intent(Dashboard.this, BelahKetupat.class);
        startActivity(bk);
    }
    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

}
