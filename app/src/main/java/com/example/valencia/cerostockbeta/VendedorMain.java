package com.example.valencia.cerostockbeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.valencia.cerostockbeta.recyclerview.model.DerpData;

public class VendedorMain extends AppCompatActivity {
    DerpData mas;
    EditText titulo;
    EditText precio;
    EditText cantidad;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor_main);
        mas= new DerpData();

        titulo = (EditText) findViewById(R.id.editText);
        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tit =titulo.getText().toString();
                mas.Mas(tit);
            }
        });

    }
}
