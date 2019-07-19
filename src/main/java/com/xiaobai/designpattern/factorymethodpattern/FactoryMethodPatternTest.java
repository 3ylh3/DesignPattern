package com.xiaobai.designpattern.factorymethodpattern;

/**
 * 工厂方法模式测试
 * 工厂方法模式：定义一个用于创建对象的接口， 让子类决定实例化哪一个类。 工厂方法使一个类的实例化延迟到其子类。
 *
 * @author 小白
 * @date 2019/7/11
 */
public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        AbstractCreator creator = new Creator();
        System.out.println("----工厂方法模式----");
        AbstractProduct product1 = creator.createProduct(ProductOne.class);
        product1.method2();
        AbstractProduct product2 = creator.createProduct(ProductTwo.class);
        product2.method2();
    }
}
