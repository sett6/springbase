package icu.sett.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author sett
 * @date 2021年05月29日 14:34
 * @title
 */
@Data
@ToString
public class Person {
    private String name;
    private Integer age;
    public Person(){
        System.out.println("无参构造");
    };
    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }
}
