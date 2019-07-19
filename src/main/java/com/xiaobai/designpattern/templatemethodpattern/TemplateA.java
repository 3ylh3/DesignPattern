package com.xiaobai.designpattern.templatemethodpattern;

/**
 * 模板A实现类
 *
 * @author 小白
 * @date 2019/7/11
 */
public class TemplateA extends AbstractTemplate {
    @Override
    protected void doSomethingOne() {
        System.out.println("模板A doSomethingOne");
    }

    @Override
    protected void doSomethingTwo() {
        System.out.println("模板A doSomethingTwo");
    }
}
