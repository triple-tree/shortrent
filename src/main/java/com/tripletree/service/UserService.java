package com.tripletree.service;

import com.tripletree.entity.User;
import com.tripletree.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liudonghua on 2016-06-08.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return (List<User>)userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
