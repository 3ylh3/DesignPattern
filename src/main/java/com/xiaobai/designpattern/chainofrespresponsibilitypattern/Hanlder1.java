package com.xiaobai.designpattern.chainofrespresponsibilitypattern;

/**
 * 处理者1
 *
 * @author 小白
 * @date 2019/7/22
 */
public class Hanlder1 extends AbstractHanlder {
    @Override
    public Response echo(Request request) {
        Response response = new Response();
        response.setMsg("处理者1处理");
        return response;
    }

    @Override
    public int getLevel() {
        return 1;
    }
}
