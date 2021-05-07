package com.example.dao;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/06 下午 11:06
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
    public void show(){
        System.out.println("hello");
    }
}
