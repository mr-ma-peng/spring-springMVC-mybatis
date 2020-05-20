package nwafu.ssm.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    //定义切入表达式
    @Pointcut("execution(* nwafu.ssm.aspectj.*.*(..))")
    public void myPointCut(){}

    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println(" 前置通知：权限检查。。。。。。");
        System.out.println(" 目标类：" + joinPoint.getTarget());
        System.out.println(" 目标方法为：" + joinPoint.getSignature().getName());
    }
    @AfterReturning(value = "myPointCut()")
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println(" 后置通知：记录日志。。。。。。");
        System.out.println(" 目标方法为：" + joinPoint.getSignature().getName());
    }
    @Around("myPointCut()")
    //ProceedingJoinPoint 是 JoinPoint接口的子接口
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println(" 环绕开始：事务开启。。。。。。");
        Object object = proceedingJoinPoint.proceed();
        System.out.println(" 环绕结束：事务关闭。。。。。。");
        return object;
    }
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println(" 异常通知：" + e.getMessage());
    }
    @After(value = "myPointCut()")
    public void myAfter(){
        System.out.println(" 最终通知：释放资源。。。。。。");
    }
}
