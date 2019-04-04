package com.example.cicles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class VerTodos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_todos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VERTODOS();
    }

    private void VERTODOS() {

        Intent intent = getIntent();

        String inicio = intent.getStringExtra(Variaveis.INICIO);
        String fim = intent.getStringExtra(Variaveis.FIM);
        String data = intent.getStringExtra(Variaveis.DATA);
        String consulta = intent.getStringExtra(Variaveis.CONSULTA);

        TextView textViewInicio = (TextView) findViewById(R.id.textViewInicio);
        TextView textViewFim = (TextView) findViewById(R.id.textViewFim);
        TextView textViewDia = (TextView) findViewById(R.id.textViewDia);
        TextView textViewConsulta = (TextView) findViewById(R.id.textViewConsulta);

        textViewInicio.setText(inicio);
        textViewFim.setText(fim);
        textViewDia.setText(data);
        textViewConsulta.setText(consulta);

        return;
    }

    public void APAGAR(View view) {

    }

    public void EDITAR(View view) {
    }
}
