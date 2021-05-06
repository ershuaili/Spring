package com.example.dao;

import com.example.service.UserService;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/04 下午 11:24
 */
public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取MySQL用户数据");
    }
}
