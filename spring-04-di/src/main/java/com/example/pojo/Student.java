package com.example.pojo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/08 下午 4:38
 */
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobby;
    private Map<String, String> card;
    private Set<String> games;
    private Properties infer;
    private String wife;
}
