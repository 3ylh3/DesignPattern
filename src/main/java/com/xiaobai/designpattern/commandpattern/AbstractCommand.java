package com.xiaobai.designpattern.commandpattern;

/**
 * 抽象命令类
 *
 * @author 小白
 * @date 2019/7/19
 */
public abstract class AbstractCommand {
    protected final AbstractReceiver receiver;

    public AbstractCommand(AbstractReceiver receiver) {
        this.receiver = receiver;
    }
    /**
     * 执行命令
     */
    public abstract void execute();
}
