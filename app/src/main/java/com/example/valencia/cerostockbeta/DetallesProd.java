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


        Bundle b = getIntent().getExtras();

        TextView text = (TextView) findViewById(R.id.textView);
        TextView desc = (TextView) findViewById(R.id.descripcion);
        TextView hor = (TextView) findViewById(R.id.hora);
        TextView cate =(TextView) findViewById(R.id.textView2);
        TextView loca =(TextView) findViewById(R.id.textView3);
        TextView prec = (TextView) findViewById(R.id.textView4);

        String titulo = (String) b.get("titulo");
        String descripcion ="Descripcion \n"+ b.get("info");
        String hora ="hora de publicacion:  "+b.get("hora");
        String catego ="categoria: "+b.get("categoria");
        String locat ="lat: "+b.get("lat")+"   long: "+b.get("longi");
        String precio = "Precio:  $"+b.get("precio");


        text.setText(titulo);
        desc.setText(descripcion);
        hor.setText(hora);
        cate.setText(catego);
        loca.setText(locat);
        prec.setText(precio);


    }
}
