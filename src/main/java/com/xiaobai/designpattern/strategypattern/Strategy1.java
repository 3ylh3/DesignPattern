package com.xiaobai.designpattern.strategypattern;

/**
 * 策略1
 *
 * @author 小白
 * @date 2019/7/23
 */
public class Strategy1 extends AbstractStrategy {

    @Override
    public void doSomething() {
        System.out.println("策略1的运算法则.");
    }
}
