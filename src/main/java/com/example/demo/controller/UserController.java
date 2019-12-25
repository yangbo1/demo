package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "getUserList", method = RequestMethod.GET)
    public String getUserList(Model model){
        model.addAttribute("userList", userService.getUserList());
        return "index";
    }
}
