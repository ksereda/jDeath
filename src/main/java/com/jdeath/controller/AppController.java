package com.jdeath.controller;

import com.jdeath.model.Account;
import com.jdeath.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class AppController {

    @Autowired
    User user;

    @Autowired
    Account account;

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping(value="/getRichestUser")
    public String getRichestUser(Model model) {
        model.addAttribute("richestUser", user.getRichestUser());
        return "user";
    }

    @RequestMapping(value="/getAccountSum")
    public String getAccountSum(Model model) {
        model.addAttribute("accountSum", account.getAccountSum());
        return "account";
    }

}
