package com.arsoft.thequizapp.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.arsoft.thequizapp.model.QuestionList;
import com.arsoft.thequizapp.model.Questions;
import com.arsoft.thequizapp.retrofit.QuestionAPI;
import com.arsoft.thequizapp.retrofit.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizRepository {
    // Interacts with the API service interfaces
    // Handling data retrieval and operations

    private QuestionAPI questionAPI;

    public QuizRepository() {
        this.questionAPI = new RetrofitInstance().getRetrofitInstance()
                .create(QuestionAPI.class);
    }

    public LiveData<QuestionList> getQuestionListFromAPI(){
        MutableLiveData<QuestionList> data = new MutableLiveData<>();

        Call<QuestionList> response = questionAPI.getQuestions();

        response.enqueue(new Callback<QuestionList>() {
            @Override
            public void onResponse(Call<QuestionList> call, Response<QuestionList> response) {
                QuestionList list = response.body();
                data.setValue(list);
            }

            @Override
            public void onFailure(Call<QuestionList> call, Throwable t) {

            }
        });

        return data;

    }
}
