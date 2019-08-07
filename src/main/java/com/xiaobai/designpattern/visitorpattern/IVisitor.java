package com.xiaobai.designpattern.visitorpattern;

/**
 * 访问者接口
 *
 * @author 小白
 * @date 2019/8/6
 */
public interface IVisitor {
    /**
     * 访问元素1
     * @param element1 元素1
     */
    public void visit(Element1 element1);

    /**
     * 访问元素2
     * @param element2 元素2
     */
    public void visit(Element2 element2);
}
