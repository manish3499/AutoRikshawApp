package com.example.manish.rikshawshare

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions


class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }


    // Include the OnCreate() method here too, as described above.
    override fun onMapReady(googleMap: GoogleMap) {

        val auto1 = LatLng(28.361146, 75.593605)
        googleMap.addMarker(
                MarkerOptions().position(auto1)
                        .title("RJ-XX0001")
        )

        val auto2 = LatLng(28.361297, 75.594045)
        googleMap.addMarker(
                MarkerOptions().position(auto2)
                        .title("RJ-XX0002")
        )

        val auto3 = LatLng(28.361278, 75.594269)
        googleMap.addMarker(
                MarkerOptions().position(auto3)
                        .title("RJ-XX0003")
        )

        val user11 = LatLng(28.357291, 75.586143)
        googleMap.addMarker(
                MarkerOptions().position(user11)
                        .title("User11")
        )

        val user12 = LatLng(28.357290, 75.586123)
        googleMap.addMarker(
                MarkerOptions().position(user12)
                        .title("User12")
        )

        val user13 = LatLng(28.357210, 75.585831)
        googleMap.addMarker(
                MarkerOptions().position(user13)
                        .title("User13")
        )

        val user21 = LatLng(28.365158, 75.588447)
        googleMap.addMarker(
                MarkerOptions().position(user21)
                        .title("User21")
        )

        val user22 = LatLng(28.365252, 75.588581)
        googleMap.addMarker(
                MarkerOptions().position(user22)
                        .title("User22")
        )

        val user23 = LatLng(28.365431, 75.588521)
        googleMap.addMarker(
                MarkerOptions().position(user23)
                        .title("User23")
        )





        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(28.358049, 75.587330), 15.0f))
    }

}

