package com.example.assignment1_ph56058;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface APIService {

    String DOMAIN = "http://192.168.1.105:3030/"; // localhost

    @GET("/api/list")
    Call<List<CarModel>> getCars();


    @POST("/api/add_xe")
    Call<List<CarModel>> addCar(@Body CarModel xe);

    @PUT("/api/update_xe")
    Call<List<CarModel>> updateCar(@Body CarModel xe);

    @DELETE("/api/xoa")
    Call<List<CarModel>> deleteCar(String id);
}
