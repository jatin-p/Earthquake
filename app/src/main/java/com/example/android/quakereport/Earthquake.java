package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;

    private String mCity;

    private String mDate;

    /*
    Constructor used to create earthquakes
     */
    public Earthquake(double magnitude, String city, String date){
        mMagnitude=magnitude;
        mCity=city;
        mDate=date;
    }

    /*
    Get Methods
     */
    double getMagnitude(){ return mMagnitude;}
    String getCity(){ return mCity;}
    String getDate(){ return mDate;}
}
