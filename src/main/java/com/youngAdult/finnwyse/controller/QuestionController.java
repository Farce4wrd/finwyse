package com.youngAdult.finnwyse.controller;

import com.youngAdult.finnwyse.entity.Question;
import com.youngAdult.finnwyse.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;



    public QuestionController() {
    }

    @GetMapping("/all")
    public List<Question> getQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getByCategory(category);
    }

    @PutMapping("/{id}")
    public void updateQuestion(@PathVariable String id){
        //this.questionService.updateQuestion();
    }



    @PostMapping("")
    public void addQuestion(@RequestBody Question question){
        questionService.add(question);
    }

}
