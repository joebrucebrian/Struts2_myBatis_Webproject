package com.lty.action;

import com.lty.model.User;
import com.lty.service.impl.userServiceImpl;
import com.lty.service.userService;
import com.opensymphony.xwork2.ActionSupport;

public class reUpdateUserAction extends ActionSupport {
    private int id;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        userService service = new userServiceImpl();
        this.setUser(service.getUserById(id));
        return SUCCESS;
    }
}
