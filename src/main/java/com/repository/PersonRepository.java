package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.domain.Person;

import java.lang.String;
import java.util.List;

//Exposing my repository as rest api
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
 
	//@Param("firstName") : first name from service call (AJAX/web service call)  ======> firstname in the method argument
	List<Person> findByFirstName(@Param("firstName") String firstname);
	
}