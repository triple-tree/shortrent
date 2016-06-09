package com.tripletree.api;

import com.tripletree.entity.User;
import com.tripletree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liudonghua on 2016-06-08.
 */
@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public List<User> listAllUser(Model model) {
        List<User> allUsers = userService.findAll();
        return allUsers;
    }

}
