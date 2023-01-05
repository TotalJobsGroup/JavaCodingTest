package com.totaljobsgroup.javacodingtest.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class QuestionRepository {

    public Map<Integer, String> getQuestions(){

        Map<Integer,String> questionMap= new HashMap<>();
        questionMap.put(10,"What is the capital of Cuba?");
        questionMap.put(20,"What is the capital of France?");
        questionMap.put(15,"What is the capital of Poland?");
        questionMap.put(25,"What is the capital of Germany?");

        return questionMap;
    }
}
