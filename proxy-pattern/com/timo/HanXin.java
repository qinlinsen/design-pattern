package com.timo;

/**
 * 这是代理类，是代理模式的核心部分
 * @author qinlinsen
 */
public class HanXin implements ConquerWorldPerson {
    ConquerWorldPerson conquerWorldPerson;

    /**代理的核心代码
     * 让韩信默认是刘邦统一天下的将军(代理人)
     */
    public HanXin() {
        //java多态的
        conquerWorldPerson=new LiuBang();
    }

    /**
     * 代理任何一个实现ConquerWorldPerson
     * @param conquerWorldPerson
     */
    public HanXin(ConquerWorldPerson conquerWorldPerson) {
        this.conquerWorldPerson = conquerWorldPerson;
    }

    @Override
    public void ambition() {
        /**
         * 代理的核心代码，conquerWorldPerson 在实例化韩信时（用的是无参构造），已经被刘邦附体，
         * 所以
         */
        conquerWorldPerson.ambition();
    }
}
