package com.xiaobai.designpattern.proxypattern;

/**
 * 真实主题类
 *
 * @author 小白
 * @date 2019/7/12
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("do something...");
    }
}
