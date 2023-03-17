package com.example.recycleview;

public class exampleitem {
    private int mImageResource;
    private String mText;

    public exampleitem(int imageResource, String text) {
        mImageResource = imageResource;
        mText = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}


