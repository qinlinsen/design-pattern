package com.timo.reflect;

import java.lang.reflect.Method;

/**java的反射例子的的简单示例
 * @author qinlinsen
 */
public class Helloworld {
    /**
     * 问候信息
     */
    private String msg;

    public Helloworld(String msg) {
        this.msg = msg;
    }

    public Helloworld() {
    }

    public void sayHelloWorld(String msg){
        System.out.println("hello "+msg);
    }

    public static void main(String[] args) throws Exception{
        String className="com.timo.reflect.Helloworld";
        //这个Class.forName(String className)中的参数className必须是类的完全限定名即：包名+类名
        Class<Helloworld> helloworldClass = (Class<Helloworld>) Class.forName(className);
        //创建Helloworld这个类的一个实例
        //这个创建实例要求这个类必须有无参构造
        Helloworld helloworld = helloworldClass.newInstance();
        Method sayHelloWorld = Helloworld.class.getMethod("sayHelloWorld", String.class);
        //调用sayHelloWorld这个方法
        sayHelloWorld.invoke(helloworld,"world");
    }
}
