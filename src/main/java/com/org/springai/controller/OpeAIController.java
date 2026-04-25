package com.org.springai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.springai.service.OpenAIService;
import com.org.springai.service.OpenAIServiceImpl;

@RestController
public class OpeAIController {

    @Autowired
    OpenAIService openAIService;

    @GetMapping("/{question}")
    String getAnswer(@PathVariable String question){
        System.out.println(question);

        return  openAIService.getAnswer(question);

    }
}
