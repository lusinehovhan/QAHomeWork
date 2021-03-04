package com.company.Exercise13;

public class MainTV {
    public static void main(String[] args) {
        TV tv1 = new TV ("Lol", 1000, 350);
        TV tv2 = new TV (600);
        TV tv3 = new TV();
        System.out.println(tv1.getChannelName());
        System.out.println(tv1.getAddPrice());
        tv1.print();
        System.out.println(tv2.getEmployees());
        tv3.setChannelName("Main");
        tv3.setEmployees(400);
        tv3.setAddPrice(650);
        tv3.print();
    }
}
