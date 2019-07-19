package com.xiaobai.designpattern.mediatorpattern;

/**
 * 抽象同事类
 *
 * @author 小白
 * @date 2019/7/19
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague (AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
