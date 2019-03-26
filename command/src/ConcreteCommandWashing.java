/**
 * @author Abraham Qin
 * @since 2018/11/27
 */
public class ConcreteCommandWashing implements Command{
    private Receiver receiver;

    public ConcreteCommandWashing(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doWashCloth();
    }
}
