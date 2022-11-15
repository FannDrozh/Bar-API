package com.example.country_mobilky;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Query;

public interface RetrofitAPIDelete {
    @DELETE("Drinks/")
    Call<DataModal> deleteData(@Query("id")int ID);
}
