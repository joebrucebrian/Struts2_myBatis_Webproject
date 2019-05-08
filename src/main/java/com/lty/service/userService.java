package com.lty.service;

import com.lty.model.User;

import java.util.List;

public interface userService {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    public User getUserById(Integer id);
    public List<User> getList();
}
