package io.toya.ch03.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Sai on 2017/3/10.
 */
@Configuration
@ComponentScan("io.toya.ch03.scheduled")
@EnableScheduling
public class ScheduledConfig {

}
