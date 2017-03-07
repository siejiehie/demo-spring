package io.toya.chap1.di;

import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/7.
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + "!";
    }

}
