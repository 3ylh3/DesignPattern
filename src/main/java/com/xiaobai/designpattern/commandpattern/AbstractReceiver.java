package com.xiaobai.designpattern.commandpattern;

/**
 * 抽象接收着类
 *
 * @author 小白
 * @date 2019/7/19
 */
public abstract class AbstractReceiver {
    /**
     * 每个接收着需要完成的业务
     */
    public abstract void doSomething();
}
