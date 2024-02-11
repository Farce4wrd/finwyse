package com.youngAdult.finnwyse.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Lesson")
public class Lesson {

    @Id
    private String id;

    private int totalTime;
}
