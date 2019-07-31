package com.xiaobai.designpattern.strategypattern;

/**
 * 封装角色
 *
 * @author 小白
 * @date 2019/7/23
 */
public class Context {
    private AbstractStrategy strategy = null;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        this.strategy.doSomething();
    }
}
