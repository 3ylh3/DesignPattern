package com.xiaobai.designpattern.abstractfactorypattern;

/**
 * 产品A抽象类
 *
 * @author 小白
 * @date 2019/7/11
 */
public abstract class AbstractProductA {
    public void publicMethod() {
        System.out.println("产品A公共方法");
    }

    /**
     * 抽象特性方法
     */
    public abstract void method();
}
