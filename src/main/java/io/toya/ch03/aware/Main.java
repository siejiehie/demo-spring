package io.toya.ch03.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/10.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfig.class);

        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.outputResult();

        ctx.close();
    }

}
