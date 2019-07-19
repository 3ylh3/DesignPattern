package com.xiaobai.designpattern.templatemethodpattern;

/**
 * 模板B实现类
 *
 * @author 小白
 * @date 2019/7/11
 */
public class TemplateB extends AbstractTemplate {
    @Override
    public void doSomethingOne() {
        System.out.println("模板B doSomethingOne");
    }

    @Override
    public void doSomethingTwo() {
        System.out.println("模板B doSomethingTwo");
    }
}
