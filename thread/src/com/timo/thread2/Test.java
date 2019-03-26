package com.timo.thread2;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class Test {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        new ThreadA(myObject).start();
        new ThreadB(myObject).start();
    }
}
