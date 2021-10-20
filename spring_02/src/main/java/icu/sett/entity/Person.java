package icu.sett.entity;

import org.springframework.context.annotation.Conditional;

/**
 * @author sett
 * @date 2021年10月03日 10:54
 * @title
 */
public class Person{
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(){}
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
