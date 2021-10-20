package icu.sett;

import icu.sett.entity.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author sett
 * @date 2021年10月03日 11:18
 * @title
 */
public class StudentFactoryBean implements FactoryBean<Student> {
    public Student getObject() throws Exception {
        return new Student("zhangsan",13);
    }

    public Class<?> getObjectType() {
        return Student.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
