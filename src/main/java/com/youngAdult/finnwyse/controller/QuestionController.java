package com.youngAdult.finnwyse.controller;

import com.youngAdult.finnwyse.entity.Question;
import com.youngAdult.finnwyse.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService quest){
        this.questionService = quest;
    }

    @GetMapping("/all")
    public List<Question> getQuestions(){
        return this.questionService.getAllQuestions();
    }

    @PostMapping("")
    public void addQuestion(@RequestBody Question question){
        this.questionService.add(question);
    }

}
