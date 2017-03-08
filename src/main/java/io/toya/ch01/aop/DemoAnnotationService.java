package io.toya.ch01.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/7.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("Hello Annotation");
    }

}
