package com.timo.thread2;

/**
 * @author Abraham Qin
 * @since 2019/2/18
 */
public class ThreadA extends Thread {
    private static final String STRING = "2334";
    private static final Integer INTEGER = new Integer("1");
    private static final String S = new String("1");
    private static final String SS = "9";
    private MyObject myObject;
    private int a;
    private String s;

    public ThreadA(MyObject myObject) {
        mytet(myObject);

    }

    public static String getSTRING() {
        return STRING;
    }

    public static Integer getINTEGER() {
        return INTEGER;
    }

    public static String getS() {
        return S;
    }

    public static String getSS() {
        return SS;
    }

    private void mytet(MyObject myObject) {
        tewstr(myObject);
    }

    private void tewstr(MyObject myObject) {
        this.setMyObject(myObject);
    }

    @Override
    public void run() {
        ee3oiiiiiiiiiiiii();
    }

    private void ee3oiiiiiiiiiiiii() {
        try {
            Thread.sleep(4 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (getMyObject() != null) {
            getMyObject().methodA();
        }
    }

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setS(String s) {
        this.s = s;
    }
}
