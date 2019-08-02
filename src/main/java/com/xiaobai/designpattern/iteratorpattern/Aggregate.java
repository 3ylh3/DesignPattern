package com.xiaobai.designpattern.iteratorpattern;

/**
 * 容器接口
 *
 * @author 小白
 * @date 2019/8/2
 */
public interface Aggregate {

    /**
     * 增加元素
     * @param object 元素
     */
    void add(Object object);

    /**
     * 减少元素
     * @param object 元素
     */
    void remove(Object object);

    /**
     * 获取迭代器
     * @return 迭代器
     */
    Iterator iterator();
}
