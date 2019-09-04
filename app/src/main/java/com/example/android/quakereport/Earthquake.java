package com.example.android.quakereport;

public class Earthquake {
    private float mMagnitude;

    private String mCity;

    private String mDate;

    /*
    Constructor
     */
    public Earthquake(float magnitude, String city, String date){
        mMagnitude=magnitude;
        mCity=city;
        mDate=date;
    }

    /*
    Get Methods
     */
    float getMagnitude(){ return mMagnitude;}
    String getCity(){ return mCity;}
    String getDate(){ return mDate;}
}
