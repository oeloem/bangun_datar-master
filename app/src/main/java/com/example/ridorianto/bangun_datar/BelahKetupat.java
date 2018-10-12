package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BelahKetupat extends AppCompatActivity  {
    EditText D1, D2;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belahketupat);

        D1 = (EditText) findViewById(R.id.D1);
        D2 = (EditText) findViewById(R.id.D2);
        b = (Button) findViewById(R.id.button5);
        hasil = (TextView) findViewById(R.id.txt_hasil);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(D1.length()== 0 && D2.length()== 0){
                    Toast.makeText(getApplication(),"D1 dan D2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(D1.length() == 0){
                    Toast.makeText(getApplication(), "D1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(D2.length() == 0){
                    Toast.makeText(getApplication(), "D2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    String isiD1 = D1.getText().toString();
                    String isiD2 = D2.getText().toString();
                    double D1= Double.parseDouble(isiD1);
                    double D2= Double.parseDouble(isiD2);
                    double hs = belahketupat(D1,D2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double belahketupat(double D1, double D2){
        return D1*D2/2;
    }
}
