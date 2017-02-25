package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BO.QuizBO;

@Controller
public class QuizController {

	@Autowired
	private QuizBO quizBO;
	
    @RequestMapping("/addQuestion")
    public String getQuestions() {
    	quizBO.addQuestions();
        return "html/searchUser";
    }

}