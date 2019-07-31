package com.xiaobai.designpattern.decoratorpattern;

/**
 * 构件实现类
 *
 * @author 小白
 * @date 2019/7/22
 */
public class Component extends AbstractComponent {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}
