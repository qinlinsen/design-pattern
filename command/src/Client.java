/**
 * @author Abraham Qin
 * @since 2018/11/27
 */
public class Client {
    public static void main(String[] args) {
        new Invoker(new ConcreteCommandEating(new Receiver())).sendCommand();
        new Invoker(new ConcreteCommandWashing(new Receiver())).sendCommand();
    }
}
