package com.example.qrscanner.api;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Endpoint {

    @POST("filterDataSiswa")
    Call<Map<String, Object>> filterData(@Query("nis") String nis);
}
