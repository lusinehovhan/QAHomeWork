package com.company.Exercise14;

public class FoodStore {
    private String productType;
    private String productName;
    private int shelfLifeDays;
    private double priceKg;

public FoodStore(String productType, String productName, int shelfLifeDays, double priceKg){
    this.productType = productType;
    this.productName = productName;
    setShelfLifeDays(shelfLifeDays);
    setPriceKg(priceKg);
}

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getShelfLifeDays() {
        return shelfLifeDays;
    }

    public void setShelfLifeDays(int shelfLifeDays) {
    if(shelfLifeDays > 0) {
        this.shelfLifeDays = shelfLifeDays;
    }else {
        this.shelfLifeDays = -1;
    }
    }

    public double getPriceKg() {
        return priceKg;
    }

    public void setPriceKg(double priceKg) {
    if(priceKg > 0) {
        this.priceKg = priceKg;
    }else {
        this.priceKg = -1;
    }
    }
    public String print(){
    String printAll = "Product Type: " + productType + "\n"
            + "Product Name: " + productName + "\n"
            + "Shelf Life in Days: " + shelfLifeDays + "\n"
            + "Product Price: " + priceKg;
           return printAll;
    }

}
