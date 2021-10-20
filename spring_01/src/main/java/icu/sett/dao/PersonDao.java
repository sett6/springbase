package icu.sett.dao;

import icu.sett.bean.Person;
import org.springframework.stereotype.Repository;

/**
 * @author sett
 * @date 2021年05月30日 12:05
 * @title
 */
@Repository
public class PersonDao extends baseDao<Person> {
    @Override
     public void save() {
        System.out.println("保存的person对象");
    }
}
