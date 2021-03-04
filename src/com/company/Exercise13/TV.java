package com.company.Exercise13;

public class TV {
    private String channelName;
    private double addPrice;
    private int employees;

    public TV(){}

    public TV(String c, double a, int e){
       channelName = c;
       setAddPrice(a);
       setEmployees(e);
    }
    public TV (int e){
       setEmployees(e);
    }

    public void setChannelName(String c) {
            channelName = c;
        }
    public String getChannelName() {
        return channelName;
    }

    public void setAddPrice(double a) {
        if (a > 600) {
            addPrice = a;
        }
    }
        public double getAddPrice() {
            return addPrice;
        }

    public void setEmployees(int e) {
       if(e >= 100 && e <= 500)
           employees = e;
    }
    public int getEmployees() {
        return employees;
    }
    public void print(){
        System.out.println("The name of the TV channel is: "+ channelName+ "\n"
                +"The price rate per minute for adds is: "+ addPrice+"$"+"\n"
        + "The number of employees is: " + employees);
    }
}
