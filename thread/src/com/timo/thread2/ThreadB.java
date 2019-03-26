package com.timo.thread2;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class ThreadB extends Thread {
    MyObject myObject;
    public ThreadB(MyObject myObject){
        this.myObject=myObject;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(4*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(myObject!=null){
         myObject.methodB();
     }
    }
}
