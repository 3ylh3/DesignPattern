package com.xiaobai.designpattern.decoratorpattern;

/**
 * 装饰模式测试
 * 装饰模式：动态地给一个对象添加一些额外的职责。就增加功能来说， 装饰模式相比生成子类更为灵活。
 *
 * @author 小白
 * @date 2019/7/22
 */
public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("----装饰模式----");
        AbstractComponent component = new Component();
        component = new Decorator(component);
        component.doSomething();
    }
}
