package com.youngAdult.finnwyse.repo;

import com.youngAdult.finnwyse.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuestionRepo extends MongoRepository<Question, String> {

    @Query("{name: '?0'}")
    Question findQuestionByName(String name);

    @Query("{category: '?0'}")
    List<Question> findQuestionByCategory(String category);



}
