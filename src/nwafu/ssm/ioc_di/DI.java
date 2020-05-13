package nwafu.ssm.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DI {
    public static void main(String[] args) {
        //初始化容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("nwafu/ssm/ioc_di/applicationContext.xml");
        //获得bean
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.login();
    }
}
