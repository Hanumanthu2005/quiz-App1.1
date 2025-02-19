package com.Hanu.quiz.App.service;


import com.Hanu.quiz.App.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);


    List<Question> findByDifficultylevel(String difficultylevel);
}
