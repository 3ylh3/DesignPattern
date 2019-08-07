package com.xiaobai.designpattern.bridgepattern;

/**
 * 桥梁模式测试
 * 桥梁模式：将抽象和实现解耦， 使得两者可以独立地变化。
 *
 * @author 小白
 * @date 2019/8/7
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        System.out.println("----桥梁模式----");
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
