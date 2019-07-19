package com.xiaobai.designpattern.builderpattern;

import java.util.List;

/**
 * 抽象产品类
 *
 * @author 小白
 * @date 2019/7/12
 */
public abstract class AbstractProduct {
    protected List<String> list;

    /**
     * 产品特有方法
     */
    protected abstract void doSomething();

    protected final void setList(List<String> list) {
        this.list = list;
    }
}
