package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void call(){
        if(strategy==null){
            throw new NullPointerException("you have not specified strategy");
        }
        strategy.strategyMethod();
    }
}
