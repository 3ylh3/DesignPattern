package com.xiaobai.designpattern.facadepattern;

/**
 * 门面对象
 *
 * @author 小白
 * @date 2019/8/5
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void methodA() {
        classA.doSomething();
    }

    public void methodB() {
        classB.doSomething();
    }

    public void methodC() {
        classC.doSomething();
    }
}
