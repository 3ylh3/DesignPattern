package com.xiaobai.designpattern.adapterpattern;

/**
 * 适配器
 *
 * @author 小白
 * @date 2019/8/2
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
