package com.xiaobai.designpattern.mediatorpattern;

/**
 * 同事类2
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Colleague2 extends AbstractColleague {

    public Colleague2(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("同事类2自有方法1.");
    }

    public void selfMethod2() {
        System.out.println("同事类2自有方法2.");
    }

    public void depMethod() {
        System.out.println("同事类2依赖方法....");
        super.mediator.doSomething2();
    }
}
