package com.demo.lab1.Service;

import com.demo.lab1.Entity.User;

import java.util.List;

public interface UserService {
     List<User> findByUserName(String userName);
}
