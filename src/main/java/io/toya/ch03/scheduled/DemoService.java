package io.toya.ch03.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sai on 2017/3/10.
 */
@Service
public class DemoService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0,15,30,45 * * * * *")
    public void fixTimeExecution() {
        System.out.println("每隔15秒执行：" + dateFormat.format(new Date()));
    }

}
