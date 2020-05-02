package com.google.sample.cloudvision;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DiscogsApi {

    @GET("database/search")
    Call<SearchResponse> getSearchResponse(@Query("q") String searchString,
                                                @Query("key") String discogsKey,
                                                @Query("secret") String discogsSecret,
                                                @Query("per_page") int perPage);

    @GET("masters/{release}")
    Call<ReleaseResponse> getReleaseResponse(@Path("release") int release);
}
