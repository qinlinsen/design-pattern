package com.daqin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**定义动态代理类，动态代理类必须要实现java的接口，InvocationHandler
 * @author qinlinsen
 */
public class Xuda implements InvocationHandler {
    private Careerism careerism;

    /**
     * 任何一个实现Careerism的接口的人都可以做Xuda的被代理人，
     * 徐达都可以做他的代理人，帮他完成愿望
     * @param careerism
     */
    public Xuda(Careerism careerism) {
        this.careerism = careerism;
    }
    public static Careerism newInstance(Careerism careerism){
        InvocationHandler handler = new Xuda(careerism);
        Careerism xuda= (Careerism)Proxy.newProxyInstance(Xuda.class.getClassLoader(),new Class[]{Careerism.class},handler);
        return xuda;
    }
    /**
     * 用proxy对象调用method方法，这个method方法的参数是args.
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //用代理对象调用方法
        System.out.println("Inside the invocation handler");
        try {
            return method.invoke(careerism, args);
        } catch (Exception e) {
            throw e.getCause();
        }
    }
}
