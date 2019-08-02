package com.xiaobai.designpattern.compositepattern;

import java.util.ArrayList;

/**
 * 树枝构件
 *
 * @author 小白
 * @date 2019/8/2
 */
public class Composite extends AbstractComponent {
    private ArrayList<AbstractComponent> list = new ArrayList<>();

    public void add(AbstractComponent component) {
        this.list.add(component);
    }

    public void remove(AbstractComponent component) {
        this.list.remove(component);
    }

    public ArrayList<AbstractComponent> getChildren() {
        return this.list;
    }
}
