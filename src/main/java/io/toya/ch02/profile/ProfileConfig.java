package io.toya.ch02.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Sai on 2017/3/8.
 */
@Configuration
@ComponentScan("io.toya.ch02.profile")
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean demoBean() {
        return new DemoBean("from development bean");
    }

    @Bean
    @Profile("prod")
    public DemoBean devDemoBean() {
        return new DemoBean("from production bean");
    }

}
