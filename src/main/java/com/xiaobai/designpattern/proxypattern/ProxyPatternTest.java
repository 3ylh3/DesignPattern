package com.xiaobai.designpattern.proxypattern;

/**
 * 代理模式测试
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问。
 *
 * @author 小白
 * @date 2019/7/12
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
