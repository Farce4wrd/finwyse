package com.youngAdult.finnwyse;

import com.youngAdult.finnwyse.entity.Question;
import com.youngAdult.finnwyse.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableMongoRepositories
public class FinnwyseApplication implements CommandLineRunner {

	@Autowired
	QuestionRepo questionRepo;

	public static void main(String[] args) {
		SpringApplication.run(FinnwyseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
