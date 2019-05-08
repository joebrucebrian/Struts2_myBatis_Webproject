package com.lty.action;

import com.lty.model.User;
import com.lty.service.impl.userServiceImpl;
import com.lty.service.userService;
import com.opensymphony.xwork2.ActionSupport;

public class deleteUserAction extends ActionSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        userService service = new userServiceImpl();
        User user = service.getUserById(id);
        service.delete(user);
        return SUCCESS;
    }
}
