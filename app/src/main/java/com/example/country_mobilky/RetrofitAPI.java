package com.example.country_mobilky;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {
    @POST("Drinks")
    Call<DataModal> createPost(@Body DataModal dataModal);

}
