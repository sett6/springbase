package icu.sett.service.impl;

import icu.sett.service.Animal;
import org.springframework.stereotype.Service;

/**
 * @author sett
 * @date 2021年05月30日 14:27
 * @title
 */
@Service
public class Dog implements Animal {
    public void eat() {
        System.out.println("骨头真好吃");
    }
}

//icu.sett.service.impl.Dog
