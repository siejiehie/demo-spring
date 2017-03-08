package io.toya.ch01.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/8.
 */
@Service
public class DemoMethodService {

    public void add() {
        System.out.println("Hello Method");
    }

}
