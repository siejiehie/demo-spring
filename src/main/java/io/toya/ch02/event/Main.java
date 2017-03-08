package io.toya.ch02.event;

import io.toya.ch01.aop.DemoAnnotationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/8.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.sayHello("World");

        ctx.close();
    }

}
