package com.timo.thread;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class IncreaseThread extends Thread {
    private NumberHolder numberHolder;

    public NumberHolder getNumberHolder() {
        return numberHolder;
    }

    public void setNumberHolder(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    public IncreaseThread(NumberHolder numberHolder){
        this.numberHolder=numberHolder;
    }

    @Override
    public void run() {
        for(int i=0;i<20;++i){

            try {
                Thread.sleep((long) (Math.random()*3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            numberHolder.increase();
        }
    }
}
