package com.example.week2.repository;

import com.example.week2.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    List<User> users = new ArrayList<>();
    public void add(User user) {
        users.add(user);
    }
    public List<User> getAll() {
        return users;
    }
    public User get(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    public void delete(int id) {
        User user = get(id);
        if(user != null) {
            users.remove(user);
        }
    }
    public void update(User user) {
       User updatedUser = get(user.getId());
       if(updatedUser != null) {
           updatedUser.setUserName(user.getUserName());
           updatedUser.setPassword(user.getPassword());
           updatedUser.setEmail(user.getEmail());
           updatedUser.setFullName(user.getFullName());
           updatedUser.setMobileNumber(user.getMobileNumber());
           updatedUser.setRole(user.getRole());
           updatedUser.setGender(user.getGender());
           updatedUser.setStatus(user.getStatus());
           updatedUser.setActive(user.isActive());
       }
    }
}
