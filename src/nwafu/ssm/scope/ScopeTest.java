package nwafu.ssm.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        //初始化
        ApplicationContext context = new ClassPathXmlApplicationContext("nwafu/ssm/scope/applicationContext.xml");
        //获取bean
        Scope scope = (Scope) context.getBean("scope");
        //输出
        System.out.println(context.getBean("scope"));
        System.out.println(context.getBean("scope"));

        System.out.println("prototype");
        System.out.println(context.getBean("prototype"));
        System.out.println(context.getBean("prototype"));

    }
}
