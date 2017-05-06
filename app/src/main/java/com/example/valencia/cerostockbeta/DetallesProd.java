package com.example.valencia.cerostockbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetallesProd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_prod);

        Vendedor vende = new Vendedor();


        Bundle b = getIntent().getExtras();
        TextView text = (TextView) findViewById(R.id.textView);
        TextView hora = (TextView) findViewById(R.id.hora);
        int alfa= (int) System.currentTimeMillis();
        int beta=(int) System.currentTimeMillis();

        String titulo = (String) b.get("titulo");
        Toast.makeText(getApplicationContext(), ""+vende.getHora(),Toast.LENGTH_SHORT).show();

        text.setText(titulo);
        hora.setText("00:00");

    }
}
