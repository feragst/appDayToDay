package com.br.daytoday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void abrirTelaLembretes(View v){

        Intent telaLembrt = new Intent(getApplicationContext(), TelaLembretes.class);
        telaLembrt.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(telaLembrt);
    }

    public void abrirTelaDiario(View v){

        Intent telaDiar = new Intent(getApplicationContext(), TelaDiario.class);
        telaDiar.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(telaDiar);
    }

    public void abrirTelaMetas(View v){

        Intent telaMet = new Intent(getApplicationContext(), TelaMetas.class);
        telaMet.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(telaMet);
    }
}