package com.google.sample.cloudvision;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("master_url")
    @Expose
    private String master_url;

    public String getMaster_url() {
        return master_url;
    }

    @SerializedName("master_id")
    @Expose
    private int master_id;

    public int getMaster_id() {
        return master_id;
    }
}
