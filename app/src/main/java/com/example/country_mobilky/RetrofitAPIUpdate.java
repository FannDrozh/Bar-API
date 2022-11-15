package com.example.country_mobilky;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface RetrofitAPIUpdate {
    @PUT("Drinks/")
    Call<DataModal> updateData(@Query("id")int id, @Body DataModal dataModal);

}
