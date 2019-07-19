package com.xiaobai.designpattern.builderpattern;

import java.util.List;

/**
 * TODO
 *
 * @author 小白
 * @date 2019/7/12
 */
public class BuilderB extends AbstractBuilder {
    private ProductB product = new ProductB();

    @Override
    public void setPart(List<String> list) {
        product.setList(list);
    }

    @Override
    public ProductB buildProduct() {
        return product;
    }
}
