package com.xiaobai.designpattern.factorymethodpattern;

/**
 * 抽象工厂实现类
 *
 * @author 小白
 * @date 2019/7/11
 */
public class Creator extends AbstractCreator {
    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> c) {
        AbstractProduct product = null;
        try{
            product = (AbstractProduct)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
