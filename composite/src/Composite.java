import java.util.ArrayList;
import java.util.List;

/**
 * @author Abraham Qin
 * @since 2018/11/25
 */
public class Composite implements Component {
    private List<Component> childComposites=new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }
    public void addChild(Component component){
        childComposites.add(component);
    }
    public void removeChild(Component component){
        childComposites.remove(component);
    }
    public List<Component> getChildren(){
        return childComposites;
    }
    @Override
    public void printStruct(String prefix) {
        System.out.println(prefix+"-"+name);
        if (childComposites !=null && childComposites.size()>0) {
            prefix += "  ";
            for(Component component:childComposites){
                //递归输出每个子对象
                component.printStruct(prefix);
            }
        }
    }
}
