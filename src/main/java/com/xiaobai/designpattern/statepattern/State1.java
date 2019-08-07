package com.xiaobai.designpattern.statepattern;

/**
 * 状态1
 *
 * @author 小白
 * @date 2019/8/6
 */
public class State1 extends AbstractState {
    @Override
    public void handle1() {
        System.out.println("状态1需要处理的逻辑...");
    }

    @Override
    public void handle2() {
        //设置状态为2
        super.context.setCurrentState(Context.STATE2);
        //切换到状态2
        super.context.handle2();
    }
}
