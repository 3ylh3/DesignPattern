package com.xiaobai.designpattern.flyweightpattern;

/**
 * 抽象享元角色
 *
 * @author 小白
 * @date 2019/8/6
 */
public abstract class AbstractFlyweight {
    /**
     * 内部状态
     */
    private String intrinsic;

    /**
     * 外部状态
     */
    protected final String extrinsic;

    public AbstractFlyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 业务操作
     */
    public abstract void doSomething();

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }
}
