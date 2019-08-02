package com.xiaobai.designpattern.iteratorpattern;

import java.util.Vector;

/**
 * 迭代器实现类
 *
 * @author 小白
 * @date 2019/8/2
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();

    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object result = null;
        if(this.hasNext()) {
            result = this.vector.get(this.cursor++);
        }
        return result;
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
