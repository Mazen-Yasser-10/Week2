package com.example.week2.controller;

import com.example.week2.User;
import com.example.week2.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController("/api/users")
public class UserController
{
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/api/users")
    public List<User> getUsers() {
        return userService.getAll();
    }
    @GetMapping("/api/users/{id}")
    public User getUser(@PathVariable int id) {
        return userService.get(id);
    }
    @PostMapping("/api/users")
    public void addUser(User user) {
        userService.add(user);
    }
    @PutMapping("/api/users")
    public void updateUser(@RequestBody User user) {
        userService.update(user);
    }
    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.delete(id);
    }
}
