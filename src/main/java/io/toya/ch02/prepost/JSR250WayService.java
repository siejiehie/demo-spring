package io.toya.ch02.prepost;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Sai on 2017/3/8.
 */
@Service
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }

}
