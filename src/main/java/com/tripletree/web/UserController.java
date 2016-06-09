package com.tripletree.web;

import com.tripletree.entity.User;
import com.tripletree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by liudonghua on 2016-06-08.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listAllUser(Model model) {
        List<User> allUsers = userService.findAll();
        model.addAttribute("users", allUsers);
        return "user/list";
    }

}
