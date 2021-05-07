package com.example;

import com.example.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/04 下午 11:19
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

   /*     //用户实际接触的事业务层，Dao层不会接触
        UserServiceImpl service = new UserServiceImpl();
        //调用MySQL实现
        service.setUserDao(new UserDaoMySqlImpl());
        service.getUser();
        //那我们现在又想用默认去实现呢
        service.setUserDao(new UserDaoImpl());
        service.getUser();*/
    }
}
