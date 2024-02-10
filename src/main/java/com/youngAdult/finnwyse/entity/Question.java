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

    private String category;

    public Question( String name, List<String> options, String correctAnswer, String metaData, String category ){
        super();
        this.name = name;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.metaData = metaData;
        this.category = category;
    }

}
