package com.xiaobai.designpattern.visitorpattern;

/**
 * 访问者模式测试
 * 访问者模式：封装一些作用于某种数据结构中的各元素的操作，
 * 它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
 *
 * @author 小白
 * @date 2019/8/6
 */
public class VisitorPatternTest {
    public static void main(String[] args) {
        System.out.println("----访问者模式----");
        for(int i = 0;i < 10;i++) {
            AbstractElement element = ObjectStructure.createElement();
            element.accept(new Visitor());
        }
    }
}
