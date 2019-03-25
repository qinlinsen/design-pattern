package com.qls;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abraham Qin
 * @since 2019/3/25
 */
public class ObjectStructure {
    private List<Node> nodes=new ArrayList<>();
    public void add(Node node){
        nodes.add(node);
    }
    public void action(Visitor visitor){
        for(Node node:nodes){
            visitor.visitor(node);
        }
    }
}
