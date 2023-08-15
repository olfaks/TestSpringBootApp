package com.version1.TestSpringBootApp.service;

import com.version1.TestSpringBootApp.model.Person;
import com.version1.TestSpringBootApp.repository.PersonRepository;

public class DeletePersonService implements PersonService{
    private final PersonRepository personRepository;

    public DeletePersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void handlePersonData(Person person) {
        personRepository.delete(person);

    }
}
