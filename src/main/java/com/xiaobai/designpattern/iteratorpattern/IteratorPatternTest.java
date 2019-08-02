package com.xiaobai.designpattern.iteratorpattern;

/**
 * 迭代器模式测试
 * 迭代器模式：提供一种方法访问一个容器对象中各个元素， 而又不需暴露该对象的内部细节。
 *
 * @author 小白
 * @date 2019/8/2
 */
public class IteratorPatternTest {
    public static void main(String[] args) {
        System.out.println("----迭代器模式----");
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("abc");
        aggregate.add("aaa");
        aggregate.add("123");
        Iterator iterator = aggregate.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
