package com.example.archit.newsapp;

/**
 * Created by archit on 13/8/17.
 */

public class News {

    String mTitle;
    String mAuthor;
    String mUrl;
    String mDate;
    String mSection;

    public News(String title, String author, String url, String date, String section) {
        mTitle = title;
        mAuthor = author;
        mUrl = url;
        mDate = date;
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getDate() {
        return mDate;
    }

    public String getSection() {
        return mSection;
    }

}
