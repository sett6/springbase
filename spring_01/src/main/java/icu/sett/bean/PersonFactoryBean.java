package icu.sett.bean;

import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;

/**
 * @author sett
 * @date 2021年05月29日 18:52
 * @title
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        Person peron = new Person();
        peron.setAge(21);
        peron.setName(UUID.randomUUID().toString());
        return peron;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
