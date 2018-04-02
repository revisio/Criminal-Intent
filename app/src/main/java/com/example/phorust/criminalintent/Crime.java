package com.example.phorust.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by phorust on 4/1/18.
 */

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //Generate unique identifier
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
