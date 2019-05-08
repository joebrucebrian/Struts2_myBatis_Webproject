package com.lty.action;

import com.lty.model.User;
import com.lty.service.impl.userServiceImpl;
import com.lty.service.userService;
import com.opensymphony.xwork2.ActionSupport;

public class updateUserAction extends ActionSupport {
    private User u;

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    @Override
    public String execute() throws Exception {
        userService service = new userServiceImpl();
        service.update(u);
        return SUCCESS;
    }
}
