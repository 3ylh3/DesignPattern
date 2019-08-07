package com.xiaobai.designpattern.flyweightpattern;

/**
 * 具体享元角色
 *
 * @author 小白
 * @date 2019/8/6
 */
public class ConcreteFlyweight extends AbstractFlyweight {
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}
