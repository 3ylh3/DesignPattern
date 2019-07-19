package com.xiaobai.designpattern.factorymethodpattern;

/**
 * 产品1
 *
 * @author 小白
 * @date 2019/7/11
 */
public class ProductOne extends AbstractProduct {
    @Override
    public void method2() {
        System.out.println("产品1的特有方法");
    }
}
