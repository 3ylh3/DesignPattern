package com.xiaobai.designpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 导演类
 *
 * @author 小白
 * @date 2019/7/12
 */
public class Director {
    private AbstractBuilder buildera = new BuilderA();
    private AbstractBuilder builderb = new BuilderB();
    private List<String> list = new ArrayList<>();

    public AbstractProduct getProducta() {
        list.clear();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        buildera.setPart(list);
        return buildera.buildProduct();
    }

    public AbstractProduct getProductb() {
        list.clear();
        list.add("D");
        list.add("C");
        list.add("B");
        list.add("A");
        builderb.setPart(list);
        return builderb.buildProduct();
    }
}
