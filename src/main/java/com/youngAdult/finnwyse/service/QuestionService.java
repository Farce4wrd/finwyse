package com.youngAdult.finnwyse.service;

import com.youngAdult.finnwyse.entity.Question;
import com.youngAdult.finnwyse.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public void createQuestion(){

    }

    public List<Question> getAllQuestions(){
        return questionRepo.findAll();

    }

    public List<Question> getByCategory(String category){
        return questionRepo.findByCategory(category);
    }

    public void add(Question question){
        this.questionRepo.save(question);
    }


}
