package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class BColleage extends AbstractColleage {
    @Override
    public void receive() {
        System.out.println("B 收到请求");
    }

    @Override
    public void send() {
        System.out.println("B 发出请求");
        //中介者转发请求
        mediator.relay(this);
    }
}
