package com.xiaobai.designpattern.builderpattern;

/**
 * 产品B实现类
 *
 * @author 小白
 * @date 2019/7/12
 */
public class ProductB extends AbstractProduct {

    @Override
    public void doSomething() {
        System.out.println("产品B:");
        for(String str : this.list){
            System.out.println(str);
        }
    }
}
