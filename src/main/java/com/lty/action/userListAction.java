package com.lty.action;

import com.lty.model.User;
import com.lty.service.impl.userServiceImpl;
import com.lty.service.userService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

public class userListAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        userService service = new userServiceImpl();
        List<User> list = service.getList();
        Map<String,Object> session = ActionContext.getContext().getSession();
        session.put("list",list);
        return SUCCESS;
    }
}
