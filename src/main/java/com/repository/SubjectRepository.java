package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.domain.Subject;
import java.lang.String;
import java.util.List;

@RepositoryRestResource
public interface SubjectRepository extends CrudRepository<Subject, Long>{

	List<Subject> findBySubjectName(String subjectname);
}
