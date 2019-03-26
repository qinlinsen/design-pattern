package com.timo.thread2;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class ThreadTest {
    public synchronized  void print(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("123");
        notify();
    }
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        for(int i=0;i<3;i++){
            thread.print();
        }
    }
}
