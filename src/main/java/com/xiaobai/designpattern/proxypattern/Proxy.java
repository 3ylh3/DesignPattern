package com.xiaobai.designpattern.proxypattern;

/**
 * 代理类
 *
 * @author 小白
 * @date 2019/7/12
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }

    private void before() {
        System.out.println("before do something...");
    }

    private void after() {
        System.out.println("after do something...");
    }
}
