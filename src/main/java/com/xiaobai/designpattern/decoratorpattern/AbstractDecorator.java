package com.xiaobai.designpattern.decoratorpattern;

/**
 * 抽象装饰类
 *
 * @author 小白
 * @date 2019/7/22
 */
public abstract class AbstractDecorator extends AbstractComponent {
    private AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        this.component.doSomething();
    }
}
