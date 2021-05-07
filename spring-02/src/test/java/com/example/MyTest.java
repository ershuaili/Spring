package com.example;

import com.example.dao.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/07 下午 4:31
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Hello hello =(Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
