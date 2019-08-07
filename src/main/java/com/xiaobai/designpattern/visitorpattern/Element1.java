package com.xiaobai.designpattern.visitorpattern;

/**
 * 元素1
 *
 * @author 小白
 * @date 2019/8/6
 */
public class Element1 extends AbstractElement {
    @Override
    public void doSomething() {
        System.out.println("element1 do something...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
