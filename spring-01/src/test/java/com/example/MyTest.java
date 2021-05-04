package com.example;

import com.example.dao.UserDao;
import com.example.dao.UserDaoImpl;
import com.example.dao.UserDaoMysql;
import com.example.dao.UserDaoMysqlImpl;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/04 下午 11:19
 */
public class MyTest {
    public static void main(String[] args) {

        //用户实际接触的事业务层，Dao层不会接触
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
