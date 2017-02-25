package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.constants.QuizConstants;
import com.domain.Question;
import com.domain.Subject;
import com.repository.QuestionRepository;
import com.repository.SubjectRepository;

@Component
public class QuizDAO {
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public void addQuestions()
	{

		Subject subject=new Subject();
		if(subjectRepository.findBySubjectName("Politics").size()==0)
		{
			subject.setSubjectName("Politics");
			subjectRepository.save(subject);
		}
		else
		{
			subject.setId(subjectRepository.findBySubjectName("Politics").get(0).getId());
		}
	
		Question question1=new Question();
		question1.setQuestion("Who is Daddy?");
		question1.setQuestionDifficultyLevel(QuizConstants.QUESTION_DIFF_LEVEL_E);
		question1.setQuestionType(QuizConstants.FIB);
		question1.setSubject(subject);
		
		Question question2=new Question();
		question2.setQuestion("Who is FM of Andhra?");
		question2.setQuestionDifficultyLevel(QuizConstants.QUESTION_DIFF_LEVEL_M);
		question2.setQuestionType(QuizConstants.FIB);
		question2.setSubject(subject);
		
		List<Question> questionsList=new ArrayList<Question>();
		questionsList.add(question1);
		questionsList.add(question2);
		questionRepository.save(questionsList);
	}
}
