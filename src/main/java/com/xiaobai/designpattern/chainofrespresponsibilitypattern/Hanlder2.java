package com.xiaobai.designpattern.chainofrespresponsibilitypattern;

/**
 * 处理者2
 *
 * @author 小白
 * @date 2019/7/22
 */
public class Hanlder2 extends AbstractHanlder {
    @Override
    public Response echo(Request request) {
        Response response = new Response();
        response.setMsg("处理者2处理");
        return response;
    }

    @Override
    public int getLevel() {
        return 2;
    }
}
