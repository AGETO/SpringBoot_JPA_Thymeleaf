package com.divae.introspring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.divae.introspring.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{
	
	List<Person> findByFirstname(@Param("name") String name);
}