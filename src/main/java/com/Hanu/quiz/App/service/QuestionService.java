package com.Hanu.quiz.App.service;


import com.Hanu.quiz.App.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questiondao;
    public List<Question> getAllQuestions() {

        return questiondao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {

        return questiondao.findByCategory(category);
    }

    public List<Question> getQuestionsByDifficultyLevel(String difficultylevel) {

        return questiondao.findByDifficultylevel(difficultylevel);
    }

    public String addQuestion(Question question) {
        questiondao.save(question);
        return "success";
    }
}
