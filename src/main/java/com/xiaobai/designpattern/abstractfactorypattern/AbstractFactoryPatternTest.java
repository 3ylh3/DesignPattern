package com.xiaobai.designpattern.abstractfactorypattern;

/**
 * 抽象工厂模式测试
 * 抽象工厂模式：为创建一组相关或相互依赖的对象提供一个接口， 而且无须指定它们的具体类。
 *
 * @author 小白
 * @date 2019/7/11
 */
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        System.out.println("----抽象工厂模式----");
        AbstractProductA a1 = creator1.createProducta();
        a1.method();
        AbstractProductA a2 = creator2.createProducta();
        a2.method();
        AbstractProductB b1 = creator1.createProductb();
        b1.method();
        AbstractProductB b2 = creator2.createProductb();
        b2.method();
    }
}
