package com.command;

/**
 * @author Abraham Qin
 * @since 2018/9/29
 */
public class BuyStockOrder implements Order {
    private StockAction stockAction;

    public BuyStockOrder(StockAction stockAction) {
        this.stockAction = stockAction;
    }

    @Override
    public void execute() {
        stockAction.buyStock();
    }
}
