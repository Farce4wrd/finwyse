package com.youngAdult.finnwyse.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="questions")
public class Question {

    @Id
    private String id;
    private String name;
    private List<String> options;
    private String correctAnswer;
    private String metaData;

    private String category;

    public Question( String name, List<String> options, String correctAnswer, String metaData, String category ){
        this.name = name;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.metaData = metaData;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    @Override
//    public String toString() {
//        return "Question{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", options=" + options +
//                ", correctAnswer='" + correctAnswer + '\'' +
//                ", metaData='" + metaData + '\'' +
//                ", category='" + category + '\'' +
//                '}';
//    }
}
