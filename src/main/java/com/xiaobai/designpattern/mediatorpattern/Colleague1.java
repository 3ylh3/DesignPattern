package com.xiaobai.designpattern.mediatorpattern;

/**
 * 同事类1
 *
 * @author 小白
 * @date 2019/7/19
 */
public class Colleague1 extends AbstractColleague {

    public Colleague1(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("同事类1自有方法1.");
    }

    public void selfMethod2() {
        System.out.println("同事类1自有方法2.");
    }

    public void depMeghod() {
        System.out.println("同事类1依赖方法....");
        super.mediator.doSomething1();
    }
}
