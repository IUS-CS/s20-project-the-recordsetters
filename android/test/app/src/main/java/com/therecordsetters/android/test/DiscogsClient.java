package com.therecordsetters.android.test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DiscogsClient {

    @GET("database/search")
    Call<DiscogsArtistInfo> infoForArtist(@Query("q") String searchString,
                                                @Query("key") String discogsKey,
                                                @Query("secret") String discogsSecret,
                                                @Query("per_page") int perPage);


    @GET("masters/{release}")
    Call<ReleaseResponse> infoForRelease(@Path("release") int release);

    /*
    //typicode example
    //==============================================================================================
    @GET("posts")
    Call<List<Tracklist>> postInfo();
    //==============================================================================================
     */
}