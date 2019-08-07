package com.xiaobai.designpattern.bridgepattern;

/**
 * 具体实现化角色
 *
 * @author 小白
 * @date 2019/8/7
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }

    @Override
    public void doAnything() {
        System.out.println("do anything...");
    }
}
