package com.timo;

/**
 * @author qinlinsen
 */
public class ProxyPatternXiangYuTest {
    public static void main(String[] args) {
        XiangYu xiangYu = new XiangYu();
        /**
         * 让韩信作为项羽的代理人，帮项羽打天下
         */
        HanXin hanXin = new HanXin(xiangYu);
        hanXin.ambition();
    }
}
