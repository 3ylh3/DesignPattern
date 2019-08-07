package com.xiaobai.designpattern.bridgepattern;

/**
 * 具体抽象化角色
 *
 * @author 小白
 * @date 2019/8/7
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
