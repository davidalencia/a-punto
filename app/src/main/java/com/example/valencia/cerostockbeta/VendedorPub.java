package com.example.valencia.cerostockbeta;

import android.Manifest;
import android.content.pm.PackageManager;

import com.google.android.gms.location.LocationListener;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;


public class VendedorPub extends AppCompatActivity implements LocationListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    GoogleApiClient apiClient;
    LocationRequest locRequest;
    Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor_pub);
        if (apiClient == null) {
            apiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API).build();
        }

        locRequest = new LocationRequest();
        locRequest.setInterval(1000);
        locRequest.setFastestInterval(500);
        locRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        apiClient.connect();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        apiClient.disconnect();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (apiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(apiClient, this);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (apiClient.isConnected()) {
            StartLocationUpdates();
        }


    }

    public void StartLocationUpdates() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        LocationServices.FusedLocationApi.requestLocationUpdates(apiClient, locRequest, this);
        Toast.makeText(getApplicationContext(), "onLoacationUpdate", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onLocationChanged(Location location) {
        if (location != null)
            Toast.makeText(getApplicationContext(), "" + location.getLongitude(), Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(getApplicationContext(), "es nulo", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(getApplicationContext(), "onChanged", Toast.LENGTH_SHORT).show();


    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        location = LocationServices.FusedLocationApi.getLastLocation(apiClient);
        Toast.makeText(getApplicationContext(), "onConnected", Toast.LENGTH_SHORT).show();
        if (location!=null){
            Toast.makeText(getApplicationContext(), "" + location.getLongitude(), Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "es nulo", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onConnectionSuspended(int i) {
        apiClient.connect();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(getApplicationContext(), "fallo", Toast.LENGTH_SHORT).show();
    }

}
