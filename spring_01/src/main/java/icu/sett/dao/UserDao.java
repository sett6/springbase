package icu.sett.dao;

import icu.sett.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author sett
 * @date 2021年05月30日 12:03
 * @title
 */
@Repository
public class UserDao extends baseDao<User> {

    @Override
     public void save() {
        System.out.println("保存的user对象");
    }
}
