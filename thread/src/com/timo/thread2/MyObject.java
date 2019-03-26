package com.timo.thread2;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class MyObject {
    synchronized public void methodA(){
        System.out.println("do A");
    }
    synchronized public void methodB(){
        System.out.println("do B");
    }
}
