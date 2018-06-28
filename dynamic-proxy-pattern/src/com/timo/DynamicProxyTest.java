package com.timo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author qinlinsen
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(subject);
        /**
         * idea 连续按两下F2就可以把doc出来
         */
        Subject proxy_subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        System.out.println(proxy_subject.getClass().getName());
        proxy_subject.rent();
        proxy_subject.hello("world");
    }
}
