package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public abstract class AbstractClass {
    public void templateMethod(){
        stepOne();
        stepTwo();
        stepThree();
    }
    public void stepOne(){
        System.out.println("step one");
    }
    public void stepTwo(){
        System.out.println("step two");
    }
    public abstract void stepThree();
}
