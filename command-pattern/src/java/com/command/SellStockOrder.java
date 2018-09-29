package com.command;

/**
 * @author Abraham Qin
 * @since 2018/9/29
 */
public class SellStockOrder implements Order {
    private StockAction stockAction;

    public SellStockOrder(StockAction stockAction) {
        this.stockAction = stockAction;
    }

    @Override
    public void execute() {
        stockAction.sellStock();
    }
}
