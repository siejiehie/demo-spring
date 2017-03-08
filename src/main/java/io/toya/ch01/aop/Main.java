package io.toya.ch01.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/8.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = ctx.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();

        DemoMethodService demoMethodService = ctx.getBean(DemoMethodService.class);
        demoMethodService.add();

        ctx.close();
    }

}
