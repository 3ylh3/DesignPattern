package com.xiaobai.designpattern.observerpattern;

/**
 * 观察者1
 *
 * @author 小白
 * @date 2019/8/2
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者收到信息...");
    }
}
