package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class ConcreteHanlderA extends Handler {

    @Override
    public void handleRequest(String str) {
        if("one".equals(str)){
            System.out.println("A");
        }else{
            Handler next = getNext();
            if (next !=null) {
                next.handleRequest(str);
            }
        }
    }
}
