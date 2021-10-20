package icu.sett.service;

import icu.sett.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

     User getUser(Integer id);

     void addUser(User user);
}
