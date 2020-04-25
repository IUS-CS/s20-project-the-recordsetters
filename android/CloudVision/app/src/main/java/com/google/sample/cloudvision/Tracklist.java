package com.google.sample.cloudvision;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tracklist {
    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }
}
