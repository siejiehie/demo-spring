package io.toya.ch02.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/8.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ElConfig.class);

        ElComponent elComponent = ctx.getBean(ElComponent.class);
        elComponent.outputResource();

        ctx.close();
    }

}
