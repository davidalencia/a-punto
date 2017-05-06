package values;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valencia.cerostockbeta.R;


public class BarraAbajo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_barra_abajo, container, false);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    public BarraAbajo(){

    }


}
