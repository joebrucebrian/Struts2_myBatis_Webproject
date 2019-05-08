package com.lty.dao.impl;

import com.lty.dao.userDao;
import com.lty.model.User;
import com.lty.util.mybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class userDaoImpl implements userDao {
    private SqlSession session = null;
    userDao dao = null;
    @Override
    public void add(User user) {
        try {
            session = mybatisUtils.getSession();
            dao = session.getMapper(userDao.class);
            dao.add(user);
            session.commit();
        }
        catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }

    @Override
    public void delete(User user) {
        try {
            session = mybatisUtils.getSession();
            dao = session.getMapper(userDao.class);
            dao.delete(user);
            session.commit();
        }
        catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }

    @Override
    public void update(User user) {
        try {
            session = mybatisUtils.getSession();
            dao = session.getMapper(userDao.class);
            dao.update(user);
            session.commit();
        }
        catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }

    @Override
    public User getUserById(Integer id) {
        User user = null;
        try {
            session = mybatisUtils.getSession();
            dao = session.getMapper(userDao.class);
            user = dao.getUserById(id);
        }
        catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
            return user;
        }
    }

    @Override
    public List<User> getList() {
        List<User> list = null;
        try {
            session = mybatisUtils.getSession();
            dao = session.getMapper(userDao.class);
            list = dao.getList();
        }
        catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
            return list;
        }
    }
}
