package com.example.valencia.cerostockbeta.recyclerview.adapter;

/**
 * Created by valencia on 5/05/17.
 */


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.valencia.cerostockbeta.CompradorMain;
import com.example.valencia.cerostockbeta.DetallesProd;
import com.example.valencia.cerostockbeta.MainActivity;
import com.example.valencia.cerostockbeta.R;
import com.example.valencia.cerostockbeta.recyclerview.model.ListItem;

import java.util.List;

/**
 * Created by valencia on 14/04/17.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>{

    private List<ListItem> listData;
    private LayoutInflater inflater;
    Context context;
    int x[]={0};

    int[] myImageList = new int[]{R.drawable.pin, R.drawable.limon, R.drawable.sandias};

    public  DerpAdapter(List<ListItem> listData, Context c){
        this.inflater =LayoutInflater.from(c);
        this.listData = listData;
    }


    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.estructura_producto, parent, false);
        context = parent.getContext();
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(final DerpHolder holder, int position) {
        final ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setBackgroundResource(myImageList[(x[0]%3)]);
//        holder.icon.setImageResource(item.getImageResId());
        holder.precio.setText("$"+item.getPrecio());
        holder.hora.setText("00:00");
        if (item.getTitle()== "limón"|| item.getTitle()=="piña"|| item.getTitle()=="sandia")
            x[0]++;


        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(context, DetallesProd.class);
                intento.putExtra("titulo", item.getTitle());
                intento.putExtra("hora", "00:00");
                intento.putExtra("precio", item.getPrecio());
                intento.putExtra("info", item.getDescripcion());
                intento.putExtra("categoria", item.getCategoria());
                intento.putExtra("longi", 19.307107908596887);
                intento.putExtra("lat", -99.1823199391365);

                context.startActivity(intento);
            }
        });




    }



    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView icon;
        private  View container;
        private  TextView precio;
        private TextView hora;
        private LinearLayout layout;

        public DerpHolder(View itemView) {
            super(itemView);

            title =(TextView) itemView.findViewById(R.id.Ibl_item_text);
            icon = (ImageView) itemView.findViewById(R.id.im_item_icon);
            container = itemView.findViewById(R.id.cont_item_root);
            precio =(TextView) itemView.findViewById(R.id.precio);
            hora =(TextView) itemView.findViewById(R.id.hora);
            layout =(LinearLayout) itemView.findViewById(R.id.holder_layout);

        }
    }


}