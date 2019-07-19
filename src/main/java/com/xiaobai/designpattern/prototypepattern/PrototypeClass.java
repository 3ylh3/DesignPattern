package com.xiaobai.designpattern.prototypepattern;

/**
 * 原型类
 *
 * @author 小白
 * @date 2019/7/15
 */
public class PrototypeClass implements Cloneable {
    public void doSomething() {
        System.out.println(this.toString() + " do something...");
    }

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try{
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
