package icu.sett;

import icu.sett.entity.Person;
import icu.sett.entity.Student;
import org.springframework.context.annotation.*;

/**
 * @author sett
 * @date 2021年10月03日 10:15
 * @title
 */
@Configuration
public class Config {
    @Bean
    public Student Student(){
        return new Student("zhagnsan",18);
    }

    @Bean("studentfactorybean")
    public StudentFactoryBean studentFactoryBean(){
        return new StudentFactoryBean();
    }
}
