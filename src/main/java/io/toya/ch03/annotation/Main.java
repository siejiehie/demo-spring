package io.toya.ch03.annotation;

import io.toya.ch02.event.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/10.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.saySomething();

        ctx.close();
    }

}
