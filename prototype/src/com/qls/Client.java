package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("消防");
        student.setAddress("人民路1550号");
        Object student2 = student.clone();
        Object student3 = student.clone();
        System.out.println(student2);
        System.out.println(student3);
    }
}
