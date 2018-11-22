package com.daqin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**动态代理的测试类
 * @author qinlinsen
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Careerism zhuYuanZang = new ZhuYuanZang();
        //让徐达做朱元璋的代理类
        InvocationHandler handler = new Xuda(zhuYuanZang);
        Careerism xuda = (Careerism) Proxy.newProxyInstance(handler.getClass().getClassLoader(), zhuYuanZang.getClass().getInterfaces(), handler);
        System.out.println(xuda.getClass().getName());
        xuda.wish();
    }
}
