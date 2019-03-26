package com.timo.thread;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class NumberHolder {
    private int number;
    public synchronized void increase(){
        while (0!=number){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(Thread.currentThread().getName()+" "+number);
        //通知在等待的线程
        notify();
    }

    public synchronized void decrease(){
        while (0==number){
            try {
               wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 能执行到这里说明已经被唤醒，并且number不为0
        number--;
        System.out.println(Thread.currentThread().getName()+" "+number);
        //通知在等待的线程
        notify();
    }
}
