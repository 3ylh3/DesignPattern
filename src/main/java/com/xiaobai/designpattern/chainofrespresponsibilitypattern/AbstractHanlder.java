package com.xiaobai.designpattern.chainofrespresponsibilitypattern;

/**
 * 抽象处理者
 *
 * @author 小白
 * @date 2019/7/22
 */
public abstract class AbstractHanlder {
    private AbstractHanlder nextHanlder;

    public final Response hanldeMessage(Request request) {
        Response response = null;
        if(this.getLevel() == request.getLevel()){
            response = this.echo(request);
        } else {
            if(this.nextHanlder != null) {
                response = this.nextHanlder.hanldeMessage(request);
            } else {
                System.out.println("没有合适的处理者");
            }
        }
        return response;
    }

    public void setNextHanlder(AbstractHanlder nextHanlder) {
        this.nextHanlder = nextHanlder;
    }

    /**
     * 处理者逻辑
     * @param request 请求
     * @return 处理者返回
     */
    protected abstract Response echo(Request request);

    /**
     * 返回处理级别
     * @return 处理级别
     */
    protected abstract int getLevel();
}
