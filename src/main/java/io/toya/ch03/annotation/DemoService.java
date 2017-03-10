package io.toya.ch03.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/10.
 */
@Service
public class DemoService {

    public void saySomething() {
        System.out.println("从组合注解配置获得的Bean");
    }

}
