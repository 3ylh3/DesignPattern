package com.xiaobai.designpattern.commandpattern;

/**
 * 命令1
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Command1 extends AbstractCommand {

    public Command1() {
        super(new Receiver1());
    }

    public Command1(AbstractReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
