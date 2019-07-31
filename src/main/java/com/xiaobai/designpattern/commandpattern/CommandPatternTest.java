package com.xiaobai.designpattern.commandpattern;

/**
 * 命令模式测试
 * 命令模式：将一个请求封装成一个对象， 从而让你使用不同的请求把客户端参数化，
 * 对请求排队或者记录请求日志， 可以提供命令的撤销和恢复功能。
 *
 * @author 小白
 * @date 2019/7/19
 */
public class CommandPatternTest {
    public static void main(String[] args) {
        System.out.println("----命令模式----");
        Invoker invoker = new Invoker();
        AbstractCommand command1 = new Command1();
        AbstractCommand command2 = new Command2();
        invoker.setCommand(command1);
        invoker.action();
        invoker.setCommand(command2);
        invoker.action();
    }
}
