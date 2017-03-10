package io.toya.ch03.enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;

import java.lang.annotation.*;

/**
 * Created by Sai on 2017/3/10.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SchedulingConfiguration.class)
public @interface EnableAsync {

    Class<? extends Annotation> annotation() default Annotation.class;
    AdviceMode model() default AdviceMode.PROXY;
    int order() default Ordered.LOWEST_PRECEDENCE;

}
