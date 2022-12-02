package com.example.assignment4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    private final View mWindow;
    private Context context;

    public CustomInfoWindowAdapter(Context context) {
        this.context = context;
        mWindow = LayoutInflater.from(context).inflate(R.layout.custom_info_window, null);
    }

    private void randowWindowText(Marker marker, View view){
        String txtViewName = "Canada's Wonderland"; // marker.getTitle();
        TextView textViewName = (TextView) view.findViewById(R.id.title);
        textViewName.setText(txtViewName);

        String txtViewTheme = "Theme Park"; // marker.getTitle();
        TextView textViewTheme = (TextView) view.findViewById(R.id.snippet);
        textViewTheme.setText(txtViewTheme);

        String txtViewAddress = "Wonderland Dr., Vaughan, ON L6A 1S6";
        TextView textViewAddress = (TextView) view.findViewById(R.id.textViewAddress);
        textViewAddress.setText(txtViewAddress);

    }

    @Nullable
    @Override
    public View getInfoContents(@NonNull Marker marker) {
        randowWindowText(marker, mWindow);
        return mWindow;
    }

    @Nullable
    @Override
    public View getInfoWindow(@NonNull Marker marker) {
        return null;
    }
}
