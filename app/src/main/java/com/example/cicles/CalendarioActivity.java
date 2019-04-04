package com.example.cicles;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void CANCELAR(View view) {
        finish();
    }

    public void Salvar(View view) {


        EditText editTextInicio = (EditText) findViewById(R.id.editTextInicio);
        EditText editTextFim = (EditText) findViewById(R.id.editTextFim);

        String inicio = editTextInicio.getText().toString();
        String fim = editTextFim.getText().toString();

        if(inicio.trim().length()== 0) {

            editTextInicio.setError("Obrigatorio");
            editTextInicio.requestFocus();
            return;
        }
            else if (fim.trim().length()== 0){

                editTextFim.setError("Obrigatorio");
                editTextFim.requestFocus();
                return;

        }
        Toast.makeText(this, "Concluido", Toast.LENGTH_LONG).show();
        finish();
    }
}
