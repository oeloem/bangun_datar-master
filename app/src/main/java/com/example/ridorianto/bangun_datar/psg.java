package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class psg extends AppCompatActivity {
    EditText s, s2;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        s = (EditText) findViewById(R.id.sisi2);
        s2 = (EditText) findViewById(R.id.sisi2);
        b = (Button) findViewById(R.id.button6);
        hasil = (TextView) findViewById(R.id.txt_hasil);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (s.length() == 0 && s2.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi dan Sisi2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (s.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (s2.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isisisi = s.getText().toString();
                    String isisisi2 = s2.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double s2 = Double.parseDouble(isisisi2);
                    double hs = persegi(s, s2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double persegi(double s, double s2) {
        return s * s2;
    }
}


