package com.google.sample.cloudvision;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;

public class SearchResponse {
    @SerializedName("results")
    @Expose
    public Collection<Results> results;
}
