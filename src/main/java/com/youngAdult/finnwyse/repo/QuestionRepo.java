package com.youngAdult.finnwyse.repo;

import com.youngAdult.finnwyse.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface QuestionRepo extends MongoRepository<Question, String> {


    List<Question> findByCategory(String category);



}
