package com.xiaobai.designpattern.mediatorpattern;

/**
 * 中介者模式测试
 * 中介者模式：用一个中介对象封装一系列的对象交互， 中介者使各对象不需要显示地相互作用，
 * 从而使其耦合松散， 而且可以独立地改变它们之间的交互。
 *
 * 同事类要使用构造函数注入中介者， 而中介者使用getter/setter方式注入同事类是因为同事类必须有中介者，
 * 而中介者却可以只有部分同事类。
 *
 * @author 小白
 * @date 2019/7/19
 */
public class MediatorPatternTest {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Colleague1 c1 = new Colleague1(mediator);
        Colleague2 c2 = new Colleague2(mediator);
        mediator.setC1(c1);
        mediator.setC2(c2);
        System.out.println("----中介者模式----");
        c1.depMeghod();
        c2.depMethod();
    }
}
