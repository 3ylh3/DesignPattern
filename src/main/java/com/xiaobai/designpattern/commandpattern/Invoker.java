package com.xiaobai.designpattern.commandpattern;

/**
 * 调用者类
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Invoker {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
