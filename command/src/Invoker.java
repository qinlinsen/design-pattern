/**
 * @author Abraham Qin
 * @since 2018/11/27
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 发送命令
     */
    public void sendCommand(){
        command.execute();
    }
}
