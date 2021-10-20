package icu.sett.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author sett
 * @date 2021年05月30日 14:30
 * @title
 */
@Component
@Aspect
public class LogUtils {

    /*
     * @date 2021/5/30 14:32
     * @describe 告诉Spring什么时候执行
     *
     *      访问权限符 返回类型  全类名 方法参数
     *      Spring 对通知方法的要求并不严格，但是方法的参数列表一定不能乱写
     *
     */
    @Before("execution(public void icu.sett.service.impl.Dog.eat())")
    public static void log(JoinPoint joinPoint){
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getSignature());
        System.out.println("方法开始执行");
    }

    @Pointcut
    public void hhpointcut(){}
}
