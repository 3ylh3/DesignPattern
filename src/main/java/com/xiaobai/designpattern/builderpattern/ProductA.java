package com.xiaobai.designpattern.builderpattern;

import java.util.List;

/**
 * 产品A实现类
 *
 * @author 小白
 * @date 2019/7/12
 */
public class ProductA extends AbstractProduct {

    @Override
    public void doSomething() {
        System.out.println("产品A:");
        for(String str : this.list){
            System.out.println(str);
        }
    }
}
