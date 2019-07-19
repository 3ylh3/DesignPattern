package com.xiaobai.designpattern.abstractfactorypattern;

/**
 * 2商品工厂实现类
 *
 * @author 小白
 * @date 2019/7/11
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProducta() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductb() {
        return new ProductB2();
    }
}
