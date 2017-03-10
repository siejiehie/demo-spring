package io.toya.ch02.event;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/8.
 */
@Service
public class DemoPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String msg) {
        applicationEventPublisher.publishEvent(new DemoEvent(this, msg));
    }

}
