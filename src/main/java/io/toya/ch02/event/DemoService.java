package io.toya.ch02.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/8.
 */
@Service
public class DemoService {

    @Autowired
    private DemoPublisher demoPublisher;

    public void sayHello(String word) {
        String msg = "Hello " + word + "!";
        System.out.println(msg);
        demoPublisher.publish(msg);
    }

}
