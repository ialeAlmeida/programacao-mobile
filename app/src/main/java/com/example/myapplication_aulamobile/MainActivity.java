package com.example.myapplication_aulamobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singInBtn();

    }

    private void singInBtn() {
        Button loginBttn = (Button) findViewById(R.id.buttonSingIn);
        TextView usuario = (TextView) findViewById(R.id.pEmail);
        TextView senha = (TextView) findViewById(R.id.pSenha);

        Intent i1 = new Intent(this, TelaInicial.class);

        loginBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i1);
            }
        });
        }
    }
