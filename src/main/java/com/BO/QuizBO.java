package com.BO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DAO.QuizDAO;

@Component
public class QuizBO {
	
	@Autowired
	QuizDAO quizDAO;
	
	public void addQuestions()
	{
		quizDAO.addQuestions();
	}
	
}
