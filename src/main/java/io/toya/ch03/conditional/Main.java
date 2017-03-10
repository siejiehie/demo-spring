package io.toya.ch03.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/10.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionalConfig.class);

        ListService listService = ctx.getBean(ListService.class);
        System.out.println("Windows系统下的列表命令为：" + listService.showListCmd());

        ctx.close();
    }

}
