package com.xiaobai.designpattern.templatemethodpattern;

/**
 * 模板方法模式测试
 * 模板方法模式：定义一个操作中的算法的框架， 而将一些步骤延迟到子类中。 使得子类可以不改变一个算法的结构
 * 即可重定义该算法的某些特定步骤。
 *
 * @author 小白
 * @date 2019/7/11
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        AbstractTemplate templatea = new TemplateA();
        AbstractTemplate templateb = new TemplateB();
        System.out.println("----模板方法模式----");
        templatea.templateMethod();
        templateb.templateMethod();
    }
}
