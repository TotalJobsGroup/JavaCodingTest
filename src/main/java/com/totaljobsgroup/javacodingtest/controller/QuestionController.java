package com.totaljobsgroup.javacodingtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @GetMapping(value = "/questionsWithScores")
    public String getQuestions(){
        return "questions";
    }
}
