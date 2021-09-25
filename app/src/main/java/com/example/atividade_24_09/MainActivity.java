package com.example.atividade_24_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btcontinuar = (Button) findViewById(R.id.btcontinuar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Resposta botão click continuar
            }
        });

        Button btcancelar = (Button) findViewById(R.id.btcancelar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Resposta botão click cancelar
            }
        });
    }
}