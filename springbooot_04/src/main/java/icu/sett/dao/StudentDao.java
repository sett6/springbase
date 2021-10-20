package icu.sett.dao;

import icu.sett.entity.User;
import org.apache.logging.log4j.status.StatusConsoleListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sett
 * @date 2021年07月06日 8:28
 * @title
 */
public class StudentDao {
    public static List<User> listUser = new ArrayList<>();
    public static Integer userid = 6;
    static {
        listUser.add(new User(1,"chenxiao","123456","20123"));
        listUser.add(new User(2,"xiaozhang","2123","20112323"));
        listUser.add(new User(3,"cheiao","123456","20123"));
        listUser.add(new User(4,"chxiao","123456","20123"));
        listUser.add(new User(5,"ciao","123456","20123"));
    }
    public static List<User> getAllUser(){
        return listUser;
    }

    public static User getUser(Integer id){
        for (User user :
                listUser) {
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public static void addUser(User user){
        userid++;
        listUser.add(user);
    }
}
