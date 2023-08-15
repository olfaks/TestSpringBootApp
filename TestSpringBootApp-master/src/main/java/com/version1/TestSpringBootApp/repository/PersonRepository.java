package com.version1.TestSpringBootApp.repository;

import com.version1.TestSpringBootApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

//    public List<Person> findAllByFirstNameEquals(String firstName);
//
//    public List<Person> findAllByAgeEquals(Integer age);

}
