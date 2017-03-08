package io.toya.ch02.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/8.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService demoSingletonService1 = ctx.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = ctx.getBean(DemoSingletonService.class);
        System.out.println("demoSingletonService1 == demoSingletonService2 ? " + (demoSingletonService1 == demoSingletonService2));

        DemoPrototypeService demoPrototypeService1 = ctx.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = ctx.getBean(DemoPrototypeService.class);
        System.out.println("demoPrototype1Service1 == demoPrototypeService2 ? " + (demoPrototypeService1 == demoPrototypeService2));

        ctx.close();
    }

}
