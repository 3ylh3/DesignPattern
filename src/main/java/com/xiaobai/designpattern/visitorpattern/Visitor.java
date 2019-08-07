package com.xiaobai.designpattern.visitorpattern;

/**
 * 访问者实现类
 *
 * @author 小白
 * @date 2019/8/6
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(Element1 element1) {
        element1.doSomething();
    }

    @Override
    public void visit(Element2 element2) {
        element2.doSomething();
    }
}
