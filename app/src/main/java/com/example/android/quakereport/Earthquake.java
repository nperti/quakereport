package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nicogdp on 11/04/17.
 */

public class Earthquake {

    // Magnitude of the earthquake
    private String mMag;

    // Ubicación
    private String mUbication;

    // Fecha
    private long mTimeInMilliseconds;

    // Earthquake objetct
    public Earthquake(String mag, String ubication, long timeInMilliseconds) {
        mMag = mag;
        mUbication = ubication;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    // Obtener magnitud
    public String getMag() {return mMag;}

    // Obtener ubicación
    public String getUbication() {return mUbication;}

    // Obtener Fecha
    public long getmTimeInMilliseconds() {return mTimeInMilliseconds;}




}
