package io.toya.ch02.prepost;

import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/8.
 */
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("初始话构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destory-method");
    }

}
