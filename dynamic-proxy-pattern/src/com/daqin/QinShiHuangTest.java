package com.daqin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Abraham Qin
 * @since 2018/11/21
 */
public class QinShiHuangTest {
    public static void main(String[] args) {
       /* //创建被代理类的对象：
        Careerism qiShiHuang = new QiShiHuang();
        //创建代理类：
        InvocationHandler handler = new Xuda(qiShiHuang);
        Careerism xuda= (Careerism) Proxy.newProxyInstance(Xuda.class.getClassLoader(),QiShiHuang.class.getInterfaces(),handler);
        xuda.wish();*/
        QiShiHuang qiShiHuang = new QiShiHuang();
        Careerism careerism = Xuda.newInstance(qiShiHuang);
        careerism.wish();
    }
}
