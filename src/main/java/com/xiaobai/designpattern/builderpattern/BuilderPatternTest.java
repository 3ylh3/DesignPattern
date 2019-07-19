package com.xiaobai.designpattern.builderpattern;

/**
 * 建造者模式测试类
 * 建造者模式：将一个复杂对象的构建与它的表示分离， 使得同样的构建过程可以创建不同的表示。
 *
 * @author 小白
 * @date 2019/7/12
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("----建造者模式----");
        AbstractProduct producta = director.getProducta();
        producta.doSomething();
        AbstractProduct productb = director.getProductb();
        productb.doSomething();
    }
}
