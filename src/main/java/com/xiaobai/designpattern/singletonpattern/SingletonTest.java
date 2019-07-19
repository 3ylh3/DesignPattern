package com.xiaobai.designpattern.singletonpattern;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 单例模式测试
 * 单例模式：确保某一个类只有一个实例， 而且自行实例化并向整个系统提供这个实例。
 *
 * @author 小白
 * @date 2019/7/11
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.test();
        System.out.println(singleton.toString());
    }
}
