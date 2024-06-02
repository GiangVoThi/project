package com.demo.lab1.Service.Impl;

import com.demo.lab1.Entity.User;
import com.demo.lab1.Repository.UserRepository;
import com.demo.lab1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
