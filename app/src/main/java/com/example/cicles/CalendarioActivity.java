package com.example.cicles;

import android.content.Intent;
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
        EditText editTextData = (EditText) findViewById(R.id.editTextData);
        EditText editTextConsulta = (EditText) findViewById(R.id.editTextConsulta);


        String inicio = editTextInicio.getText().toString();
        String fim = editTextFim.getText().toString();
        String data = editTextData.getText().toString();
        String consulta = editTextConsulta.getText().toString();

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

        Intent intent = new Intent(this, VerTodos.class);

            intent.putExtra(Variaveis.INICIO, inicio);
            startActivity(intent);

            intent.putExtra(Variaveis.FIM, fim);
            startActivity(intent);

            intent.putExtra(Variaveis.DATA, data);
            startActivity(intent);

            intent.putExtra(Variaveis.CONSULTA, consulta);
            startActivity(intent);





        Toast.makeText(this, "Concluido", Toast.LENGTH_LONG).show();
        finish();
    }
}
