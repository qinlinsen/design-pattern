package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteHanlderB extends Handler {

    @Override
    public void handleRequest(String str) {
        if("two".equals(str)){
            System.out.println("B");
        }else{
            Handler next = getNext();
            if (next !=null) {
                next.handleRequest(str);
            }
        }
    }
}
