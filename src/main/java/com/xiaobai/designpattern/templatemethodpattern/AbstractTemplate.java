package com.xiaobai.designpattern.templatemethodpattern;

/**
 * 抽象模板类
 *
 * @author 小白
 * @date 2019/7/11
 */
public abstract class AbstractTemplate {
    /**
     * 基本方法1
     */
    protected abstract void doSomethingOne();

    /**
     * 基本方法2
     */
    protected abstract void doSomethingTwo();

    /**
     * 模板方法
     */
    public final void templateMethod() {
        this.doSomethingOne();
        this.doSomethingTwo();
    }
}
