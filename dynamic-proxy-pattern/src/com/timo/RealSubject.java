package com.timo;

/**定义被代理类
 * @author qinlinsen
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want rent my house !");
    }

    @Override
    public void hello(String msg) {
        System.out.println("hello "+msg);
    }
}
