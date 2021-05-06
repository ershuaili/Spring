package com.example.dao;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/04 下午 11:13
 */
public class UserDaoImpl implements UserDao {
    /**
     * Dao的实现类默认的
     */
    @Override
    public void getUser() {
        System.out.println("默认获取用户数据");
    }
}
