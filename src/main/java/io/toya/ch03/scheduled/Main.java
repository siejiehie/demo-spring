package io.toya.ch03.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sai on 2017/3/10.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }

}
