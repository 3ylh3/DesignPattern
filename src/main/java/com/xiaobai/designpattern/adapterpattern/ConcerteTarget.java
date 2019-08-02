package com.xiaobai.designpattern.adapterpattern;

/**
 * 目标角色实现类
 *
 * @author 小白
 * @date 2019/8/2
 */
public class ConcerteTarget implements Target {

    @Override
    public void request() {
        System.out.println("目标角色自己的方法...");
    }
}
