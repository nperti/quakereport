package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nicogdp on 11/04/17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
            Earthquake currentEarthquake = getItem(position);

            TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
            magnitudeTextView.setText(currentEarthquake.getMag());

            TextView ubicationTextView = (TextView) listItemView.findViewById(R.id.ubication);
            ubicationTextView.setText(currentEarthquake.getUbication());

            Date dateObject = new Date(currentEarthquake.getmTimeInMilliseconds());

            TextView dateView = (TextView) listItemView.findViewById(R.id.date);
            String formattedDate = formatDate(dateObject);
            // Display the date of the current earthquake in that TextView
            dateView.setText(formattedDate);


            TextView timeView = (TextView) listItemView.findViewById(R.id.time);
            // Format the time string (i.e. "4:30PM")
            String formattedTime = formatTime(dateObject);
            // Display the time of the current earthquake in that TextView
            timeView.setText(formattedTime);


            return listItemView;

        }

    private String formatDate(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }


}
