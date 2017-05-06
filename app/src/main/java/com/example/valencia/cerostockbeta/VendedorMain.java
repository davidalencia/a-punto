package com.example.valencia.cerostockbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.valencia.cerostockbeta.recyclerview.model.DerpData;

public class VendedorMain extends AppCompatActivity {
    DerpData mas;
    EditText titulo;
    EditText catego;
    EditText descripcion;
    EditText preci;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor_main);
        mas= new DerpData();

        titulo = (EditText) findViewById(R.id.editText);
        descripcion =(EditText) findViewById(R.id.editText2);
        catego=(EditText)findViewById(R.id.editText3);
        preci = (EditText)findViewById(R.id.editText4);
        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tit =titulo.getText().toString();
                String desc =descripcion.getText().toString();
                String cate =catego.getText().toString();
                String precio = preci.getText().toString();
                mas.Mas(tit, desc, "00:00", cate, 19.307107908596887,-99.1823199391365, precio);
                Intent intento= new Intent(getApplicationContext(), DetallesProd.class);
                intento.putExtra("titulo", tit);
                intento.putExtra("precio", precio);
                intento.putExtra("info",  desc);
                intento.putExtra("hora", "00:00");
                intento.putExtra("categoria", cate);
                intento.putExtra("longi", 19.307107908596887);
                intento.putExtra("lat", -99.1823199391365);
                startActivity(intento);
            }
        });

    }
}
