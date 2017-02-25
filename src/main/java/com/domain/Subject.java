package com.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subject {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name="subject_name")
    private String subjectName;
    
    @OneToMany(mappedBy="subject")
    private Set<Question> questionsSet;
    
	public Set<Question> getQuestionsSet() {
		return questionsSet;
	}

	public void setQuestionsSet(Set<Question> questionsSet) {
		this.questionsSet = questionsSet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
    
 
}
