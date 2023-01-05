package com.totaljobsgroup.javacodingtest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QuestionController.class)
@ExtendWith(MockitoExtension.class)
public class QuestionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getQuestions() throws Exception {
        //given
        String requestUrl = "/questionsWithScores";

        //when

        ResultActions response = mockMvc.perform(get(requestUrl));

        //then
        response.andExpect(status().isOk());
    }



}
