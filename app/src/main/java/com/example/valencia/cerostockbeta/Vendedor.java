package com.example.valencia.cerostockbeta;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by valencia on 5/05/17.
 */

public class Vendedor  {

    Date d=new Date();
    int HoraInicio;
    int MinutoInicio;
    public void Vendedor(){
        SimpleDateFormat Hora = new SimpleDateFormat("hh");
        HoraInicio =Integer.parseInt(Hora.format(d));
        SimpleDateFormat Min = new SimpleDateFormat("mm");
        MinutoInicio = (int) (System.currentTimeMillis());
        int HoraFinal;
        int MinFinal;
        int Precio;
        int Cantidad;
        String Nombre;
    }
    public int getHora(){

        return MinutoInicio;


    }

}
