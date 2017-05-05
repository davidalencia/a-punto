package com.example.valencia.cerostockbeta.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valencia on 5/05/17.
 */
public class DerpData {
    private static final String[] titles={"hola1", "hola2", "hola3", "hola4"};
    private static final int[] icons={android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_menu_add, android.R.drawable.ic_menu_delete};

    public static List<ListItem> getListData(){
        List<ListItem> data= new ArrayList<>();

        //repeat proces 4 times, so we have enough data to demostrate a scroliable
        //Recycler view

        for (int alfa =0; alfa<4; alfa++){
            //create ListItem with dummy data, then add them to the list
            for (int beta=0; beta<titles.length && beta<icons.length; beta++){
                ListItem item =new ListItem();
                item.setImageResId(icons[beta]);
                item.setTitle(titles[beta]);
                data.add(item);
            }
        }

        return data;

    }

}