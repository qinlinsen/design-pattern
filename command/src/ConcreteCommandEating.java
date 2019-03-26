/**
 * @author Abraham Qin
 * @since 2018/11/27
 */
public class ConcreteCommandEating implements Command{
    private Receiver receiver;

    public ConcreteCommandEating(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doEating();
    }
}
