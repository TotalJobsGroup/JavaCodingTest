package com.totaljobsgroup.javacodingtest.service;

import com.totaljobsgroup.javacodingtest.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QuestionServiceImpl implements IQuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    @Override
    public String getQuestions() {
        return "questions";
    }
}
