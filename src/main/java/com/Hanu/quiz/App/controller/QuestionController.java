package com.Hanu.quiz.App.controller;


import com.Hanu.quiz.App.Question;
import com.Hanu.quiz.App.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionservice;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionservice.getAllQuestions();
    }


    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category)
    {
        return questionservice.getQuestionsByCategory(category);
    }

    @GetMapping("difficultylevel/{difficultylevel}")
    public List<Question> getQuestionsByDifficultyLevel(@PathVariable  String difficultylevel){
        return questionservice.getQuestionsByDifficultyLevel(difficultylevel);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question)
    {
        return questionservice.addQuestion(question);
    }
}
