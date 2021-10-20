package icu.sett.service;

import icu.sett.dao.StudentDao;
import icu.sett.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author sett
 * @date 2021年07月06日 8:36
 * @title
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        return StudentDao.getAllUser();
    }

    @Override
    public User getUser(Integer id) {
        return StudentDao.getUser(id);
    }

    @Override
    public void addUser(User user){
        StudentDao.addUser(user);
    }
}
