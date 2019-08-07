package com.xiaobai.designpattern.statepattern;

/**
 * 状态2
 *
 * @author 小白
 * @date 2019/8/6
 */
public class State2 extends AbstractState {
    @Override
    public void handle1() {
        //设置状态为1
        super.context.setCurrentState(Context.STATE1);
        //切换到状态1
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("状态2需要处理的逻辑...");
    }
}
