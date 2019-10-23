package com.example.endofsemester;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;




public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);
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



        this.mMap = googleMap;


        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.mapstyle));

            if (!success) {
                Log.e("MapsActivity", "Style parsing failed.");
            }

        } catch (Resources.NotFoundException e) {
            Log.e("MapActivity", "Can't find style. Error: ", e);
        }
        // Add a marker in Sydney and move the camera
        LatLng israel = new LatLng(31.6095813,34.811959);
        mMap.addMarker(new MarkerOptions().position(israel).title("משתמש").icon(bitmapDescriptorFromVector(getApplicationContext(), R.drawable.marker_new)));
       mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(israel,11f));

        LatLng ulam = new LatLng(31.592477,34.7649543);
        mMap.addMarker(new MarkerOptions().position(ulam).title("גני ההצולה ").icon(bitmapDescriptorFromVector(getApplicationContext(), R.drawable.aatsulapng)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ulam,11f));

        LatLng ulam2 = new LatLng(31.5522246,34.7706958);
        mMap.addMarker(new MarkerOptions().position(ulam2).title("אולם אירועים").icon(bitmapDescriptorFromVector(getApplicationContext(), R.drawable.iconhulam2)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ulam2,11f));

        LatLng ulam3 = new LatLng(31.5669098,34.7890968);
        mMap.addMarker(new MarkerOptions().position(ulam3).title("אולם אירועים").icon(bitmapDescriptorFromVector(getApplicationContext(), R.drawable.iconhulam)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ulam3,11f));

        LatLng ulam4 = new LatLng(31.6565157,34.7766986);
        mMap.addMarker(new MarkerOptions().position(ulam4).title("גני האחוזה").icon(bitmapDescriptorFromVector(getApplicationContext(), R.drawable.aahuzalogo)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ulam4,11f));

        LatLng ulam5 = new LatLng(31.6495127,34.7317078);
        mMap.addMarker(new MarkerOptions().position(ulam5).title("גני הצבי").icon(bitmapDescriptorFromVector(getApplicationContext(), R.drawable.ganeyhatsvilogo)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ulam5,11f));
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);

        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());

        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }


}
