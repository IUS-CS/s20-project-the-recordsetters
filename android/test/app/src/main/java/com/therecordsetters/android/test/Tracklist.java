package com.therecordsetters.android.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tracklist {

    public class InternalTracklist{

    }

    //typicode example
    //==============================================================================================
    /*
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("title")
    @Expose
    private String title;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //==============================================================================================
    */

    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("type_")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
