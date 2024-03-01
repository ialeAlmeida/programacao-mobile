package com.example.myapplication_aulamobile;

import androidx.appcompat.app.AppCompatActivity;

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

        botoes();
    }

    private void botoes() {

      /*Button somar = (Button) findViewById(R.id.inc);
        Button toast2 = (Button) findViewById(R.id.toast);

        TextView title2 = (TextView) findViewById(R.id.title);*/

        //setando que na atividade clicar no botão toast2, ele vai criar automaticamente um método
        //para acessar o OnClick da View e dentro dos parâmetros
        //toast2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "BOTÃO TOAST", Toast.LENGTH_SHORT).show();
//            }
//        });

//        somar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                title2.setText("E ái, companheiro!");
//            }
//        });

//        somar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = title2.getText().toString();
//                int result = Integer.parseInt(s);
//                result++;
//                title2.setText(String.valueOf(result));
//
//            }
//        });

        }
    }
