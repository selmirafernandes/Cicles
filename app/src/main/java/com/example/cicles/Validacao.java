package com.example.cicles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Validacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacao);
    }

    public void NAO(View view) {
        finish();
    }

    public void SIM(View view) {

        Toast.makeText(this, "apagado com sucesso", Toast.LENGTH_LONG).show();
        finish();
    }
}
