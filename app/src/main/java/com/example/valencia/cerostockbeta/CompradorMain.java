package com.example.valencia.cerostockbeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.valencia.cerostockbeta.recyclerview.adapter.DerpAdapter;
import com.example.valencia.cerostockbeta.recyclerview.model.DerpData;

public class CompradorMain extends AppCompatActivity {

    private RecyclerView recView;
    private DerpAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprador_main);

        recView = (android.support.v7.widget.RecyclerView)findViewById(R.id.rec_list);
        //Linear Manager: gridLayoutMAnager  or StaggeredGridLayoutManager
        recView.setLayoutManager(new LinearLayoutManager(this));


        adapter = new DerpAdapter(DerpData.getListData()/*Regresa data(ArrayList<>)*/, this);
        recView.setAdapter(adapter);



    }
}
