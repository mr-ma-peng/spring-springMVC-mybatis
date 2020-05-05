package nwafu.ssm.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC {
    public static void main(String[] args) {
        //初始化容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取bean
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
        //运行方法
        userDao.login();
    }
}
