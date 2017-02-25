package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name="question")
    private String question;
    
    @Column(name="question_type")
    private String questionType;
    
    @Column(name="ques_diff_level")
    private char questionDifficultyLevel;
    
    //When u say, JoinColumn  ---> doesn't refer to the other tables column but the same table. But it refers to Subject table's primary key. (Go through DB Schema)
    @ManyToOne(targetEntity=Subject.class)
    @JoinColumn(name="subject_id")
    private Subject subject;

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public char getQuestionDifficultyLevel() {
		return questionDifficultyLevel;
	}

	public void setQuestionDifficultyLevel(char questionDifficultyLevel) {
		this.questionDifficultyLevel = questionDifficultyLevel;
	}
    
    
 
}
