package com.therecordsetters.android.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;

public class ReleaseResponse {
    @SerializedName("tracklist")
    @Expose
    public Collection<Tracklist> tracklist;
}
