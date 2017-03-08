package io.toya.ch02.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Sai on 2017/3/8.
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
