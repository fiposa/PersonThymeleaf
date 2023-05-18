package feliks.personthymeleaf.repository;


import feliks.personthymeleaf.model.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer>{
    @Override
    List<Person> findAll();

    //@Override
   // Optional<Person> findById(Integer integer);

    //Optional<Person> findPersonByAge( Integer age);
    //Optional<Person> findPersonByName (String name);
   // Optional <Person> findAll

    // @Override
    //List<Person> findAllById(Iterable<Integer> integers);


    //Optional<Person> findByAge (Integer age);
    //<Person> findByName (String name);

    //Optional<Person> findFirstByName ();

}
