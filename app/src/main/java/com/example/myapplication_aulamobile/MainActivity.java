package com.example.myapplication_aulamobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setar visualmente a tela activity_main
        setContentView(R.layout.activity_main);


    }

    private void singInBtn() {
        Button loginBtn = (Button) findViewById(R.id.button2);
        //Button usuario = (Button) findViewById(R.id.editTextTextEmailAddress);
        //Button senha = (Button) findViewById(R.id.password);

        Intent i = new Intent(this, telaInicial.class);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        }
    }
