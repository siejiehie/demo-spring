package io.toya.ch01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Sai on 2017/3/8.
 */
@Configuration
@ComponentScan("io.toya.ch01.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
