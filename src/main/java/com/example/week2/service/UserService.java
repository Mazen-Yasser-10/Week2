package com.example.week2.service;

import com.example.week2.User;
import com.example.week2.repository.UserRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final AtomicInteger id = new AtomicInteger(1);
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public List<User> getAll() {
        return userRepo.getAll();
    }
    public User get(Integer id) {
        return userRepo.get(id);
    }
    public void add(User user) {
        user.setId(id.getAndIncrement());
        userRepo.add(user);
    }
    public void update(User user) {
        userRepo.update(user);
    }
    public void delete(int id) {
        userRepo.delete(id);
    }

}
