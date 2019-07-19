package com.xiaobai.designpattern.factorymethodpattern;

/**
 * 抽象产品类
 *
 * @author 小白
 * @date 2019/7/11
 */
public abstract class AbstractProduct {
    public void method1() {
        System.out.println("产品共有的方法");
    }

    /**
     * 抽象产品方法
     */
    public abstract void method2();
}
