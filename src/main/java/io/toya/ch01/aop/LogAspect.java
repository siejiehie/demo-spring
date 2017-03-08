package io.toya.ch01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Sai on 2017/3/8.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(io.toya.ch01.aop.Action)")
    public void annotationPointcut() {}

    @Pointcut("execution(* io.toya.ch01.aop.DemoMethodService.*(..))")
    public void methodPointcut() {}

    @After("annotationPointcut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + action.name());
    }

    // @Before("execution(* io.toya.ch01.aop.DemoMethodService.*(..))")
    @Before("methodPointcut()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }

}
