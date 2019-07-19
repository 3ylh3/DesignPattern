package com.xiaobai.designpattern.builderpattern;

import java.util.List;

/**
 * 抽象建造者类
 *
 * @author 小白
 * @date 2019/7/12
 */
public abstract class AbstractBuilder {
    /**
     * 设置产品不同部分
     * @param list 不同产品部分list
     */
    public abstract void setPart(List<String> list);

    /**
     * 建造产品
     * @return ProductA
     */
    public abstract AbstractProduct buildProduct();
}
