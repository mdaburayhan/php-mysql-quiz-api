package com.arsoft.thequizapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.arsoft.thequizapp.model.QuestionList;
import com.arsoft.thequizapp.repository.QuizRepository;

public class QuizViewModel extends ViewModel {

    QuizRepository repository = new QuizRepository();

    LiveData<QuestionList> questionListLiveData;

    public QuizViewModel() {
        questionListLiveData = repository.getQuestionListFromAPI();
    }

    public LiveData<QuestionList> getQuestionListLiveData() {
        return questionListLiveData;
    }
}
