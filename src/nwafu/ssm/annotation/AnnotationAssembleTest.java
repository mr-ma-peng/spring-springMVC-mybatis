package nwafu.ssm.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("nwafu/ssm/annotation/applicationContext.xml");

        UserController userController = (UserController)applicationContext.getBean("userController");

        userController.save();
    }
}
