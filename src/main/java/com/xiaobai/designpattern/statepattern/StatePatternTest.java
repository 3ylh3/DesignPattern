package com.xiaobai.designpattern.statepattern;

/**
 * 状态模式测试
 * 状态模式：当一个对象内在状态改变时允许其改变行为， 这个对象看起来像改变了其类。
 *
 * @author 小白
 * @date 2019/8/6
 */
public class StatePatternTest {
    public static void main(String[] args) {
        System.out.println("----状态模式----");
        Context context = new Context();
        context.setCurrentState(new State1());
        context.handle1();
        context.handle2();
    }
}
