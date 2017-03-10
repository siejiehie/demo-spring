package io.toya.ch03.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Sai on 2017/3/10.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AspectJAutoProxyRegistrar.class)
public @interface EnableAspectJAutoProxy {

    boolean proxyTargetClass() default false;

}
