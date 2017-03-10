package io.toya.ch03.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.lang.annotation.Target;

/**
 * Created by Sai on 2017/3/10.
 */
@Service
public class DemoService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }

}
