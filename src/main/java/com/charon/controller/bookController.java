package com.charon.controller;


import com.charon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookController {
    @Autowired
    private User user;

    @GetMapping("/book")
    public String book(){
        System.out.println("boot");
        System.out.println(user.getHobby());
        System.out.println(user);
        return "boots";
    }
}
