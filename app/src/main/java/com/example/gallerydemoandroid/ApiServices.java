package com.example.gallerydemoandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiServices {

    @POST("api/property/getProperty/{propertyId}")
    Call<List<Result>> getProperties(@Path("propertyId") Long propertyID);



}
