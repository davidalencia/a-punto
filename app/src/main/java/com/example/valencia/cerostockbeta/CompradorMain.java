package com.example.valencia.cerostockbeta;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.valencia.cerostockbeta.recyclerview.adapter.DerpAdapter;
import com.example.valencia.cerostockbeta.recyclerview.model.DerpData;

public class CompradorMain extends AppCompatActivity {

    private RecyclerView recView;
    private DerpAdapter adapter;
    DerpData data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprador_main);

        data = new DerpData();


        recView = (android.support.v7.widget.RecyclerView)findViewById(R.id.rec_list);
        //Linear Manager: gridLayoutMAnager  or StaggeredGridLayoutManager
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DerpAdapter(DerpData.getListData()/*Regresa data(ArrayList<>)*/, this);
        recView.setAdapter(adapter);

    }
    public CompradorMain(){

    }
    static public double lat(){
        return 19.307107908596887;
    }
    static final public double lon(){
        return -99.1823199391365;
    }

}
