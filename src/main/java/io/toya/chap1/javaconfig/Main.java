package io.toya.chap1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/7.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("Higgs Atom"));
        ctx.close();
    }

}
