/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String prefix) {
        System.out.println(prefix+"-"+name);
    }
}
