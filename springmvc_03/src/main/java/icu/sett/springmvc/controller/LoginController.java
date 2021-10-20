package icu.sett.springmvc.controller;

import icu.sett.springmvc.bean.User;
import icu.sett.springmvc.customDataBinder.StringToListPropertyEditor;
import icu.sett.springmvc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author sett
 * @date 2021年06月03日 19:36
 * @title 测试
 */
@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,false));
        binder.registerCustomEditor(String[].class,new StringToListPropertyEditor());
    }



    @GetMapping("/public/{id}")
    @ResponseBody
    public List<User> getUserById(@PathVariable("id")Integer id){
        System.out.println(id);
        List<User> users = userMapper.selectAll();
        return users;
    }

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
    @PostMapping("/test")
    @ResponseBody
    public String test(@RequestParam("date")Date date){
        System.out.println(date);
        return date.toString();
    }

    @GetMapping("/test2")
    @ResponseBody
    public String test2(@RequestParam("name") String[] result){

        return Arrays.toString(result);

    }


}
