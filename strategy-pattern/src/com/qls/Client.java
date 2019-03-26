package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        StrategyA strategyA = new StrategyA();
        context.setStrategy(strategyA);
        context.call();
    }
}
