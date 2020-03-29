package com.gaip.catroid_share;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface api {
    @GET("{part}")
    Call<appdetails> getUserData(@Path("part") String part);
}

