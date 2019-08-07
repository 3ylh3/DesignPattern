package com.xiaobai.designpattern.flyweightpattern;

/**
 * 享元模式测试
 * 享元模式：使用共享对象可有效地支持大量的细粒度的对象。
 *
 * @author 小白
 * @date 2019/8/6
 */
public class FlyweightPatternTest {
    public static void main(String[] args) {
        System.out.println("----享元模式----");
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        AbstractFlyweight flyweight1 = flyweightFactory.getFlyweight("1");
        System.out.println(flyweight1.toString());
        flyweight1.doSomething();
        AbstractFlyweight flyweight2 = flyweightFactory.getFlyweight("2");
        System.out.println(flyweight2.toString());
        flyweight2.doSomething();
        AbstractFlyweight flyweight3 = flyweightFactory.getFlyweight("1");
        System.out.println(flyweight3.toString());
        flyweight3.doSomething();
    }
}
