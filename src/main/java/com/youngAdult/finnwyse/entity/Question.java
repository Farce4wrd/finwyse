package com.youngAdult.finnwyse.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("questions")
public class Question {

    @Id
    private String id;
    private String name;
    private List<String> options;
    private String correctAnswer;
    private String metaData;

    public Question(String id, String name, List<String> options, String correctAnswer, String metaData ){
        this.id = id;
        this.name = name;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.metaData = metaData;
    }

}
