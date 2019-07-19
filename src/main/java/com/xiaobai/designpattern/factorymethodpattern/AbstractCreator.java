package com.xiaobai.designpattern.factorymethodpattern;

/**
 * 抽象工厂类
 *
 * @author 小白
 * @date 2019/7/11
 */
public abstract class AbstractCreator {
    /**
     * 根据传入参数生产产品
     * @param c 传入类
     * @param <T> 产品泛型类
     * @return 产品
     */
    public abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
