package icu.sett.controller;

import icu.sett.dao.StudentDao;
import icu.sett.entity.User;
import icu.sett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sett
 * @date 2021年07月06日 8:37
 * @title
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    @CrossOrigin
    @PostMapping
    public Map<String,Object> addUser(@RequestBody User user){
        user.setId(StudentDao.userid);
        StudentDao.addUser(user);
        Map<String,Object> map = new HashMap<>();
        map.put("success",true);
        return map;
    }


}
