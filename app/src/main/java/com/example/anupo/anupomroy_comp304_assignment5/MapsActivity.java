package com.example.anupo.anupomroy_comp304_assignment5;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.InfoWindowAdapter {
//
    private GoogleMap mMap;
    Bitmap bitmap;
    SharedPreferences sharePref=getSharedPreferences("logoInfo", Context.MODE_PRIVATE );
    String brandName=sharePref.getString("brand","");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        String name=getIntent().getStringExtra("name");
        if (name.equals("Roadsport_Honda"))
        {
            LatLng hondaScarborough = new LatLng(43.766704, -79.279696);
            mMap.addMarker(new MarkerOptions().position(hondaScarborough).title("Roadsport Honda").snippet(" 940 Ellesmere Rd, \nScarborough, ON M1P 2W8" + "\n" +
                    "\nSales:(416) 291-9501").icon(BitmapDescriptorFactory.fromResource(R.drawable.honda)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(hondaScarborough));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        else if (name.equals("Honda_Downtown"))
        {
            LatLng hondaDowntown = new LatLng(43.652940, -79.359111);
            mMap.addMarker(new MarkerOptions().position(hondaDowntown).title("Honda Downtown").snippet(" 47 Eastern Ave, \nToronto, ON M5A 1H1" + "\n" +
                    "\nSales:+1 833-766-5587").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(hondaDowntown));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        //For Toyota location View
        else if (name.equals("Scarborough_Toyota"))
        {
            LatLng hondaDowntown = new LatLng(43.725238, -79.294616);
            mMap.addMarker(new MarkerOptions().position(hondaDowntown).title("Scarborough Toyota").snippet(" 47 Eastern Ave, \nToronto, ON M5A 1H1" + "\n" +
                    "\nSales:+1 833-766-5587").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(hondaDowntown));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        else if (name.equals("Woodbine_Toyota"))
        {
            LatLng hondaDowntown = new LatLng(43.713944, -79.592965);
            mMap.addMarker(new MarkerOptions().position(hondaDowntown).title("Woodbine Toyota").snippet(" 80 Queens Plate Dr, \nEtobicoke, ON M9W 7K2" + "\n" +
                    "\nSales:+ (416) 741-3222").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(hondaDowntown));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        else{}

        //http://www.zoftino.com/google-maps-android-custom-info-window-example
        mMap.setInfoWindowAdapter(this) ;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        View view=getLayoutInflater().inflate(R.layout.custom_window,null);

        TextView titl=(TextView) view.findViewById(R.id.txtTitle);
        TextView snip=(TextView) view.findViewById(R.id.txtSnipped);
        ImageView imageView=(ImageView)view.findViewById(R.id.imgView);
        //imageView.setImageResource(R.drawable.toyota);
        //ImageButton imgBtn=(ImageButton) view.findViewById(R.id.imageButton);
        if(brandName.equals("Woodbine_Toyota"))
        {

        }

        //imgBtn.setImageDrawable(marker.);
        titl.setText(marker.getTitle().toString());
        snip.setText(marker.getSnippet().toString());
        return view;
    }

    @Override
    public View getInfoContents(Marker marker) {
      return null;
    }
}
