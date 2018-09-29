package com.command;

/**
 * @author Abraham Qin
 * @since 2018/9/29
 */
public class CommandPatterTest {
    public static void main(String[] args) {
        StockAction stockAction = new StockAction();
        BuyStockOrder buyStockOrder = new BuyStockOrder(stockAction);
        SellStockOrder sellStockOrder = new SellStockOrder(stockAction);
        Broker broker = new Broker();
        //人接受到命令去买彩票
        broker.takeOrder(buyStockOrder);
        //人接受到命令去卖彩票
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
