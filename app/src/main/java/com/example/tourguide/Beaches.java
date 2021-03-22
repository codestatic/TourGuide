package com.example.tourguide;

public class Beaches {

    private String mBeachTitle;

    private String mBeachSummary;

    private int mBeach;

    public Beaches(String beachTitle, String beachSummary, int beach) {
        mBeachTitle = beachTitle;
        mBeachSummary = beachSummary;
        mBeach = beach;
    }

    public String getBeachTitle() {
        return mBeachTitle;
    }

    public String getBeachSummary() {
        return mBeachSummary;
    }

    public int getBeach() { return mBeach; }

}

