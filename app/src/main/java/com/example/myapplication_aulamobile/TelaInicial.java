package com.example.myapplication_aulamobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        botoes();
    }

    private void botoes() {

        Button bttnIncrementar = (Button) findViewById(R.id.inc);
        Button bttnTelefone = (Button) findViewById(R.id.tel);
        Button bttnAlarme = (Button) findViewById(R.id.alarme);
        Button bttnVoltar = (Button)findViewById(R.id.voltar);
        TextView numberInc = (TextView) findViewById(R.id.number0);

        bttnTelefone.setOnClickListener(new View.OnClickListener() {
            Intent i = new Intent(Intent.ACTION_DIAL);

            @Override
            public void onClick(View v) {
                i.setData(Uri.parse("tel:986543265"));
                startActivity(i);
            }
        });

    }
}