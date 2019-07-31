package com.xiaobai.designpattern.chainofrespresponsibilitypattern;

/**
 * 责任链模式测试
 * 责任链模式：使多个对象都有机会处理请求， 从而避免了请求的发送者和接受者之间的耦合关系。
 * 将这些对象连成一条链， 并沿着这条链传递该请求， 直到有对象处理它为止。
 *
 * @author 小白
 * @date 2019/7/22
 */
public class ChainOfRespresponsibilityPatternTest {
    public static void main(String[] args) {
        System.out.println("----责任链模式----");
        AbstractHanlder hanlder1 = new Hanlder1();
        AbstractHanlder hanlder2 = new Hanlder2();
        AbstractHanlder hanlder3 = new Hanlder3();
        hanlder1.setNextHanlder(hanlder2);
        hanlder2.setNextHanlder(hanlder3);
        Request request = new Request();
        request.setLevel(2);
        Response response = hanlder1.hanldeMessage(request);
        System.out.println(response.getMsg());
    }
}
