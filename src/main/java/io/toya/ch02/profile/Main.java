package io.toya.ch02.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/8.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setDefaultProfiles("prod");
        ctx.register(ProfileConfig.class);
        ctx.refresh();

        DemoBean demoBean = ctx.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        ctx.close();
    }

}
