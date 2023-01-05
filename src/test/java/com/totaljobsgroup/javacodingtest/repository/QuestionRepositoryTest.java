package com.totaljobsgroup.javacodingtest.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class QuestionRepositoryTest {

    QuestionRepository questionRepository;

    @BeforeEach
    public void setUp(){
        questionRepository = new QuestionRepository();
    }

    @Test
    public void getQuestions_should_return_list_of_all_questions(){
        //given

        //when
        Map<Integer, String> questionMapFromRepo = questionRepository.getQuestions();

        //then
        assertEquals(4, questionMapFromRepo.size());

    }

}
