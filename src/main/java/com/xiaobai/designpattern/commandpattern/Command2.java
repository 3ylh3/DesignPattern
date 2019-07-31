package com.xiaobai.designpattern.commandpattern;

/**
 * 命令2
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Command2 extends AbstractCommand {

    public Command2() {
        super(new Reveiver2());
    }

    public Command2(AbstractReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
