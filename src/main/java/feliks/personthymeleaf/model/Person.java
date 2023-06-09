package feliks.personthymeleaf.model;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Entity
//@Component
@Table
public class Person {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    @Column
    String name;

    @Column
    int age;

    @OneToOne
    Dog dog;

    public Person() {
    }

    public Person(int id, String name, int age, Dog dog) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}

