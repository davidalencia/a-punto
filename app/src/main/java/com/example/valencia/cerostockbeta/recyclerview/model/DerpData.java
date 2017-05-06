package com.example.valencia.cerostockbeta.recyclerview.model;

import com.example.valencia.cerostockbeta.CompradorMain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valencia on 5/05/17.
 */
public class DerpData {
    CompradorMain comprador= new CompradorMain();
    private static final String[] titles={"piña", "limón", "sandia", "aguacate"};
    private static final String[] description={"Esto es una gran e increible descripcion sobre una fruta", "Esto lo llamo el gran cuento de la fruta magica \nPD: esto es una descripcion", "bla bla bla bla bla bla (descripcion original) bla bla bla bla bla bla bla bla", "esto es un ejemplo de como se veria una descripcion cualquiera dentro  de la app"};
    private static final String horaInicio="00:00";
    private static final int[] icons={android.R.drawable.ic_popup_reminder,
          android.R.drawable.ic_menu_add, android.R.drawable.ic_menu_delete};
    //loc lat, lon //android.R.drawable.ic_menu_delete
    private static final double lat =19.307107908596887;
    private static final double lon =-99.1823199391365;
    private static final String precio = "10.0";
    //categoria
    private  static final String[] categoria = {"verduras","frutas","carnes","pan"};
    //img

    static List<ListItem> data= new ArrayList<>();
    public static List<ListItem> getListData(){


        //repeat proces 4 times, so we have enough data to demostrate a scroliable
        //Recycler view

        for (int alfa =0; alfa<4; alfa++){
            //create ListItem with dummy data, then add them to the list
            for (int beta=0; beta<titles.length && beta<icons.length; beta++){
                if((lat-CompradorMain.lat())<1){
                    if((lon-CompradorMain.lon())<1){
                        ListItem item = new ListItem();
                        item.setPrecio(precio);
                        item.setLat(lat);
                        item.setLon(lon);
                        item.setCategoria(categoria[beta]);
                        item.setHoraInicio(horaInicio);
                        item.setDescripcion(description[beta]);
                        item.setImageResId(icons[beta]);
                        item.setTitle(titles[beta]);
                        data.add(item);
                    }
                }
            }
        }

        return data;

    }
    public void DerpData(){

    }
    public void Mas(String titulo, String descripcion, String hora, String cat, double lati, double longi, String precio){
        ListItem item =new ListItem();
        item.setPrecio(precio);
        item.setHoraInicio(hora);
        item.setImageResId(icons[0]);
        item.setLat(lati);
        item.setLon(longi);
        item.setCategoria(cat);
        item.setDescripcion(descripcion);
        item.setTitle(titulo);
        data.add(item);
    }
    public void clear(){
        data.clear();
    }



}