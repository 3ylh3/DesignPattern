package com.xiaobai.designpattern.visitorpattern;

/**
 * 抽象元素
 *
 * @author 小白
 * @date 2019/8/6
 */
public abstract class AbstractElement {
    /**
     * 业务逻辑
     */
    public abstract void doSomething();

    /**
     * 允许谁来访问
     * @param vistor 访问者
     */
    public abstract void accept(IVisitor vistor);
}
