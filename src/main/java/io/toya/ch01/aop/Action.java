package io.toya.ch01.aop;

import java.lang.annotation.*;

/**
 * Created by Sai on 2017/3/7.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();

}
