package com.xiaobai.designpattern.iteratorpattern;

import java.util.Vector;

/**
 * 容器实现类
 *
 * @author 小白
 * @date 2019/8/2
 */
public class ConcreteAggregate implements Aggregate {
    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
