package com.therecordsetters.android.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiscogsArtistInfo {
/*
    @SerializedName("master_url")
    @Expose
    private String masterUrl;

    public String getMasterUrl() {
        return masterUrl;
    }
 */

    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }

}
