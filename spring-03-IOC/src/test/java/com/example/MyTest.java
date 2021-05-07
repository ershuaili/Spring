package com.example;

import com.example.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/07 下午 5:25
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
}
