package com.totaljobsgroup.javacodingtest.service;

import com.totaljobsgroup.javacodingtest.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class QuestionServiceImplTest {

    private IQuestionService questionService;
    private QuestionRepository questionRepositoryMock;

    @BeforeEach
    public void setUp(){
        questionRepositoryMock = Mockito.mock(QuestionRepository.class);
        questionService = new QuestionServiceImpl(questionRepositoryMock);
    }

    @Test
    public void getQuestions_should_return_questions_with_scores(){
    //given

    //when
    String questionsMapFromRepo = questionService.getQuestions();

    //then
    assertNotNull(questionsMapFromRepo);
    assertEquals("questions", questionsMapFromRepo);

    }
}
