package com.xiaobai.designpattern.commandpattern;

/**
 * 接收者1
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Receiver1 extends AbstractReceiver {

    @Override
    public void doSomething() {
        System.out.println("接收者1完成命令.");
    }
}
