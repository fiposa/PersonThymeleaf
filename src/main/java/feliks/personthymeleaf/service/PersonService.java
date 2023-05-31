package feliks.personthymeleaf.service;


import feliks.personthymeleaf.model.Person;
import feliks.personthymeleaf.repository.PersonRepository;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public List <Person> findAll (){
        return personRepository.findAll();
    }
    public Optional<Person> findFirst (){
        return personRepository.findAll().stream().findFirst();
    }

    public Optional<Person> findRandom (){

         List<Person> persons =  personRepository.findAll().stream().toList();

        return Optional.ofNullable(persons.get(1));
    }

    public Person show(int id) {
        return findAll().stream().filter(person -> person.getId()==id).findAny().orElse(null);

    }

    public void save (Person person){
        personRepository.save(person);
        System.out.println("person saved");
    }






}
