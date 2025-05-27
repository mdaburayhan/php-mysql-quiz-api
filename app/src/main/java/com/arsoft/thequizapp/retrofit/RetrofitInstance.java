package com.arsoft.thequizapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    String baseUrl = "http://localhost/quiz/";

    // Create and Return a configured Retrofit Instance
    public Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
