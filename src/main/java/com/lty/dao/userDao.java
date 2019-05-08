package com.lty.dao;

import com.lty.model.User;

import java.util.List;

public interface userDao {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    public User getUserById(Integer id);
    public List<User> getList();
}
