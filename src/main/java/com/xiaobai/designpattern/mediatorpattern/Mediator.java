package com.xiaobai.designpattern.mediatorpattern;

/**
 * 中介者实现类
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Mediator extends AbstractMediator {

    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod1();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod2();
        super.c2.selfMethod2();
    }
}
