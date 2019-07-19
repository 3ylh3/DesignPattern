package com.xiaobai.designpattern.prototypepattern;

/**
 * 原型模式测试
 * 原型模式：用原型实例指定创建对象的种类， 并且通过拷贝这些原型创建新的对象。
 *
 * @author 小白
 * @date 2019/7/15
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        PrototypeClass prototype = new PrototypeClass();
        System.out.println("----原型模式----");
        PrototypeClass class1 = prototype.clone();
        class1.doSomething();
        PrototypeClass class2 = prototype.clone();
        class2.doSomething();
    }
}
