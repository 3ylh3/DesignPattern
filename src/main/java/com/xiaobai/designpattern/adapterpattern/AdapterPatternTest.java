package com.xiaobai.designpattern.adapterpattern;

/**
 * 适配器模式测试
 * 适配器模式：将一个类的接口变换成客户端所期待的另一种接口，
 * 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *
 * @author 小白
 * @date 2019/8/2
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        System.out.println("----适配器模式----");
        Target target1 = new ConcerteTarget();
        target1.request();
        Target target2 = new Adapter();
        target2.request();
    }
}
