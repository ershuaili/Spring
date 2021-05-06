package com.example.service;

import com.example.dao.UserDao;
import com.example.dao.UserDaoImpl;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/04 下午 11:17
 */
public class UserServiceImpl implements UserService{
    /**
     * service的实现
     */

    private UserDao userDao;

    /**
     * 利用set方法进行注入
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
