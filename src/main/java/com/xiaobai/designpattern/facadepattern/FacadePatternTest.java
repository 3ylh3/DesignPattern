package com.xiaobai.designpattern.facadepattern;

/**
 * 门面模式测试
 * 门面模式：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。
 * 门面模式提供一个高层次的接口， 使得子系统更易于使用。
 *
 * @author 小白
 * @date 2019/8/5
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        System.out.println("----门面模式----");
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
