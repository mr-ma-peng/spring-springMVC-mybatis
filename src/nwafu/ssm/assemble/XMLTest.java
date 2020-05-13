package nwafu.ssm.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    public static void main(String[] args) {
        //初始化
        ApplicationContext context = new ClassPathXmlApplicationContext("nwafu/ssm/assemble/applicationContext.xml");
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }
}
