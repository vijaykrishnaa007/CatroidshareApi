package com.gaip.catroid_share;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView,recent,viewed,remix,suggested;
    private Retrofit retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.mostdownloaded);
        recent=findViewById(R.id.recent);
        viewed=findViewById(R.id.mostviewed);
        remix=findViewById(R.id.remix);
        suggested=findViewById(R.id.suggested);
        String url = "https://share.catrob.at/app/api/projects/";
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        getUserList("mostDownloaded.json",recyclerView);
        getUserList("mostViewed.json",viewed);
        getUserList("scratchRemixes.json",remix);
        getUserList("recent.json",recent);
        getUserList("recsys_general_projects.json",suggested);
    }

    private void getUserList(String part, final RecyclerView recyclerView) {

            api service = retrofit.create(api.class);


            Call<appdetails> call = service.getUserData(part);

            call.enqueue(new Callback<appdetails>() {
                @Override
                public void onResponse(Call<appdetails> call, Response<appdetails> response) {

                    appdetails resp= response.body();
                    shareapiadapter shareapiadapter=new shareapiadapter(resp);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.HORIZONTAL,false));
                    recyclerView.setAdapter(shareapiadapter);


                }

                @Override
                public void onFailure(Call<appdetails> call, Throwable t) {

                }
            });
    }
    }
