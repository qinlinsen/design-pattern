package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class StrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("A Strategy");
    }
}
