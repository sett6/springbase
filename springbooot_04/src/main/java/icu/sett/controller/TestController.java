package icu.sett.controller;

import icu.sett.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sett
 * @date 2021年07月05日 10:39
 * @title
 */
@RestController
public class TestController {

    @CrossOrigin
    @GetMapping("/test")
    public Map<String,Object> getTest(){

        Map<String,Object> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}
