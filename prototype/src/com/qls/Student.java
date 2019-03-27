package com.qls;

/**
 * @author Abraham Qin
 * @since 2019/3/27
 */
public class Student implements Cloneable{
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("copy successfully !");
        }
        return null;
    }
}
