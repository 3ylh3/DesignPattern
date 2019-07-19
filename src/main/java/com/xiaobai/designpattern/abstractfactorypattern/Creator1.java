package com.xiaobai.designpattern.abstractfactorypattern;

/**
 * 1产品工厂实现类
 *
 * @author 小白
 * @date 2019/7/11
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProducta() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductb() {
        return new ProductB1();
    }
}
