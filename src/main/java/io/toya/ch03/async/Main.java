package io.toya.ch03.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/10.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AsyncConfig.class);

        DemoService demoService = ctx.getBean(DemoService.class);
        for (int i = 0; i < 10; i++) {
            demoService.executeAsyncTask(i);
            demoService.executeAsyncTaskPlus(i);
        }

        ctx.close();
    }

}
