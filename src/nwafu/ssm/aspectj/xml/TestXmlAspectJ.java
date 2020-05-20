package nwafu.ssm.aspectj.xml;

import nwafu.ssm.aspectj.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspectJ {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("nwafu/ssm/aspectj/xml/applicationContext.xml");

        UserDao userDao = (UserDao)applicationContext.getBean("userDao");

        userDao.addUser();
    }
}
