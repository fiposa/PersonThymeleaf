package feliks.personthymeleaf.model;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
//@Component
@Table
public class Person {
    @Id
    @Column
    @GeneratedValue

    int id;

    @Column
    String name;

    @Column
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
