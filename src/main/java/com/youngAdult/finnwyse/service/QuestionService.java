package com.youngAdult.finnwyse.service;

import com.youngAdult.finnwyse.entity.Question;
import com.youngAdult.finnwyse.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {

    private QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo quest){
        this.questionRepo = quest;
    }

    public void createQuestion(){
        this.questionRepo.save(new Question("Who am I?", Arrays.asList("A", "B", "C"), "A","",""));
    }

    public List<Question> getAllQuestions(){
        return this.questionRepo.findAll();
    }

    public void add(Question question){
        this.questionRepo.save(question);
    }
}
