package com.xiaobai.designpattern.builderpattern;

import java.util.List;

/**
 * 建造者实现类
 *
 * @author 小白
 * @date 2019/7/12
 */
public class BuilderA extends AbstractBuilder {
    private ProductA product = new ProductA();

    @Override
    public void setPart(List<String> list) {
        product.setList(list);
    }

    @Override
    public ProductA buildProduct() {
        return product;
    }
}
