package com.qls;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class ConcreateMediator implements Mediator {
    private List<AbstractColleage> colleages=new ArrayList<>();
    @Override
    public void register(AbstractColleage colleage) {
        if (!colleages.contains(colleage)) {
           colleages.add(colleage);
           colleage.setMediator(this);
        }
    }

    @Override
    public void relay(AbstractColleage colleage) {
        for (AbstractColleage abstractColleage : colleages) {
            if(!abstractColleage.equals(colleage)){
                abstractColleage.receive();
            }
        }
    }
}
