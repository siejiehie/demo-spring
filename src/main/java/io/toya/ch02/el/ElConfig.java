package io.toya.ch02.el;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Sai on 2017/3/8.
 */
@Configuration
@ComponentScan("io.toya.ch02.el")
@PropertySource("classpath:test.properties")
public class ElConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
