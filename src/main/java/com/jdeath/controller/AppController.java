package com.jdeath.controller;

import com.jdeath.model.AccountSum;
import com.jdeath.model.UserRichest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired
    private UserRichest userRichest;

    @Autowired
    AccountSum accountSum;

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value="/getRichestUser")
    public String getRichestUser(Model model) {
        model.addAttribute("richestUser", userRichest.getRichestUser());
        return "user";
    }

    @RequestMapping(value="/getAccountSum")
    public String getAccountSum(Model model) {
        model.addAttribute("accountSum", accountSum.getAccountSum());
        return "account";
    }

}
