package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class Client {
    public static void main(String[] args) {
        ConcreateMediator concreateMediator = new ConcreateMediator();
        AColleage aColleage = new AColleage();
        BColleage bColleage = new BColleage();
        concreateMediator.register(aColleage);
        concreateMediator.register(bColleage);
        aColleage.send();
        System.out.println("----------------------");
        bColleage.send();
    }
}
