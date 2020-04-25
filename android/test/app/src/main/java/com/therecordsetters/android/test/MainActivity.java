package com.therecordsetters.android.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Collection;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.view1);

        //String API_BASE_URL = "https://jsonplaceholder.typicode.com/";
        String API_BASE_URL = "https://api.discogs.com/";

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder =
                new Retrofit.Builder()
                        .baseUrl(API_BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.client(httpClient.build()).build();

        DiscogsClient client =  retrofit.create(DiscogsClient.class);
/*
        Call<Tracklist> call = client.infoForArtist("Pink Floyd Dark Side Of The Moon",
                "yVJvGKOaNBuLpUOkDwoJ",
                "SwfdineoyCxyMfxMGAoEmohQxkqrGjgl",
                1);
*/

        Call<ReleaseResponse> call = client.infoForRelease(10362);

        call.enqueue(new Callback<ReleaseResponse>() {
            @Override
            public void onResponse(Call<ReleaseResponse> call, Response<ReleaseResponse> response) {
                //String message = response.body().getDuration();

                if (!response.isSuccessful()){
                    textView.setText(response.code());
                    return;
                }

                Collection<Tracklist> tracklists = response.body().tracklist;

                for (Tracklist tracklist:tracklists){
                    String message = "";
                    message+=tracklist.getTitle() + "\n";

                    textView.append(message);
                }
            }

            @Override
            public void onFailure(Call<ReleaseResponse> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });
        
    }
}
