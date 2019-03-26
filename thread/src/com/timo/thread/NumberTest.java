package com.timo.thread;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class NumberTest {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        IncreaseThread increaseThread = new IncreaseThread(numberHolder);
        DecreaseThread decreaseThread = new DecreaseThread(numberHolder);
        increaseThread.start();
        decreaseThread.start();
        IncreaseThread increaseThread2 = new IncreaseThread(numberHolder);
        DecreaseThread decreaseThread2 = new DecreaseThread(numberHolder);
        increaseThread2.start();
        decreaseThread2.start();
    }
}
