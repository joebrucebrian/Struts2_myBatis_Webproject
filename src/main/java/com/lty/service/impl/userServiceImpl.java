package com.lty.service.impl;

import com.lty.dao.impl.userDaoImpl;
import com.lty.dao.userDao;
import com.lty.model.User;
import com.lty.service.userService;

import java.util.List;

public class userServiceImpl implements userService {
    private userDao dao = new userDaoImpl();
    @Override
    public void add(User user) {
        dao.add(user);
    }

    @Override
    public void delete(User user) {
        dao.delete(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Override
    public User getUserById(Integer id) {
        return dao.getUserById(id);
    }

    @Override
    public List<User> getList() {
        return dao.getList();
    }
}
