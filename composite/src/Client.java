/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("服装");
        Composite boyCostume = new Composite("男装");
        Composite girlCostume = new Composite("女装");
        Leaf shirt = new Leaf("衬衫");
        Leaf jacket = new Leaf("夹克");
        root.addChild(boyCostume);
        root.addChild(girlCostume);
        boyCostume.addChild(shirt);
        girlCostume.addChild(jacket);
        root.printStruct("");
    }
}
