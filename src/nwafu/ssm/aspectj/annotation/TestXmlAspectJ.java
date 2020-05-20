package nwafu.ssm.aspectj.annotation;

import nwafu.ssm.aspectj.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspectJ {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("nwafu/ssm/aspectj/annotation/applicationContext.xml");

        UserDao userDao = (UserDao)applicationContext.getBean("userDao");

        userDao.deleteUser();
    }
}
