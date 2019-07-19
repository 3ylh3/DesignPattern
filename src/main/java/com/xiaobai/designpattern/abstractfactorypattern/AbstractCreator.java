package com.xiaobai.designpattern.abstractfactorypattern;

/**
 * 抽象工厂类
 *
 * @author 小白
 * @date 2019/7/11
 */
public abstract class AbstractCreator {
    /**
     * 创建产品A
     * @return 产品A
     */
    public abstract AbstractProductA createProducta();

    /**
     * 创建产品B
     * @return 产品B
     */
    public abstract AbstractProductB createProductb();
}
