package com.xiaobai.designpattern.decoratorpattern;

/**
 * 装饰类
 *
 * @author 小白
 * @date 2019/7/22
 */
public class Decorator extends AbstractDecorator {
    public Decorator(AbstractComponent component) {
        super(component);
    }

    public void method() {
        System.out.println("修饰方法，");
    }

    @Override
    public void doSomething() {
        this.method();
        super.doSomething();
    }
}
