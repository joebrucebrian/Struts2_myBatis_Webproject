package com.lty.action;

import com.lty.model.User;
import com.lty.service.impl.userServiceImpl;
import com.lty.service.userService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.*;

public class UserActions extends ActionSupport {
    private User user;
    private User u;
    private int id;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String addUser(){
        userService service = new userServiceImpl();
        service.add(u);
        return "add";
    }

    public String deleteUser(){
        userService service = new userServiceImpl();
        User user = service.getUserById(id);
        service.delete(user);
        return "delete";
    }

    public String reUpdateUser(){
        userService service = new userServiceImpl();
        this.setUser(service.getUserById(id));
        return "reupdate";
    }

    public String updateUser(){
        userService service = new userServiceImpl();
        service.update(u);
        return "update";
    }
    private int page = 1;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    private String c = "id+";

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }


    public String userList(){
        userService service = new userServiceImpl();
        List<User> list = service.getList();
        if(c.equals("id-")){
            Collections.sort(list, new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return o2.getId()-o1.getId();
                }
            });
        }
        Map<String,Object> session = ActionContext.getContext().getSession();
        session.put("list",list);
        session.put("c",c);
        fenye(list,session);

        return "userlist";
    }

    public void fenye(List<User> list,Map<String,Object> session){
        int pagecount = list.size() / 5 + (list.size() % 5 == 0 ? 0 : 1);
        session.put("pagecount",pagecount);
        if (page == 0){
            page=1;
        }else if(page == pagecount+1){
            page=pagecount;
        }
        int begin = (page - 1) * 5;
        session.put("begin",begin);
        session.put("page",page);
    }

    public String userListDESC(){
        userService service = new userServiceImpl();
        List<User> list = service.getList();
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getId()-o1.getId();
            }
        });
        Map<String,Object> session = ActionContext.getContext().getSession();
        session.put("list",list);
        fenye(list,session);
        return "userlistdesc";
    }
}
