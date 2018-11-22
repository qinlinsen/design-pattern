package com.timo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**定义代理类，这里是动态代理，动态代理类必须要实现接口InvocationHandler
 * @author qinlinsen
 */
public class DynamicProxy implements InvocationHandler {
    private Subject subject;

    /**
     * 代理任何一个实现Subject的类
     * @param subject
     */
    public DynamicProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      /*  System.out.println("在代理真实对象前可以做自己的操作，即动态代理自己做的事情");
        System.out.println("method="+method);*/
        /**
         * 动态代理对象调用被代理类的方法时，会自动调用代理对象关联的handler对象的invoke方法
         */
        Object obj = method.invoke(subject, args);

        //在代理真实对象后也可以做自己的事情
//        System.out.println("在代理真实对象后也可以做自己的事情，动态代理做的事情");
        return obj;
    }
}
