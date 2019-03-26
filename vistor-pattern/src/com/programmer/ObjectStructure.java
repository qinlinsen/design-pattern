package com.programmer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class ObjectStructure {
    private List<Element> elements=new ArrayList<>();
    private void add(Element element){
        elements.add(element);
    }
    public void accept(Visitor visitor){

        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            element.accept(visitor);
        }
    }
    public void call(){
        elements.add(new ConcreteElement());
        elements.add(new Element() {
            @Override
            public void accept(Visitor visitor) {
                System.out.println("h");
            }
        });
        accept(new ConcreteVisitor());
    }
    public static void main(String[] args) {
        new ObjectStructure().call();
    }
}
