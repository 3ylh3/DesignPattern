package com.xiaobai.designpattern.singletonpattern;

/**
 * 单例模式
 *
 * @author 小白
 * @date 2019/7/11
 */
public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return SINGLETON;
    }

    public void test() {
        System.out.println("--------单例模式--------");
    }
}
