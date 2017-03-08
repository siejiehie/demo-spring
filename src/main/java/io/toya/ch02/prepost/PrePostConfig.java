package io.toya.ch02.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Sai on 2017/3/8.
 */
@Configuration
@ComponentScan("io.toya.ch02.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

}
