package com.arsoft.thequizapp.retrofit;

import com.arsoft.thequizapp.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionAPI {
    // Used to define the structure and behavior of
    // network requests to a RESTful Api.
    // Acts as a bridge between android app and web service

    @GET("myquizapi.php") // end point
    Call<QuestionList> getQuestions();

}
