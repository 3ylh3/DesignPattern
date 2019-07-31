package com.xiaobai.designpattern.commandpattern;

/**
 * 接收者2
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Reveiver2 extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("接收者2完成命令.");
    }
}
