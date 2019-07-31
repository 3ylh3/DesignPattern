package com.xiaobai.designpattern.strategypattern;

/**
 * 策略模式测试
 * 策略模式：定义一组算法， 将每个算法都封装起来， 并且使它们之间可以互换。
 *
 * @author 小白
 * @date 2019/7/23
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        System.out.println("----策略模式----");
        AbstractStrategy strategy1 = new Strategy1();
        AbstractStrategy strategy2 = new Strategy2();
        Context context1 = new Context(strategy1);
        Context context2 = new Context(strategy2);
        context1.doSomething();
        context2.doSomething();
    }
}
