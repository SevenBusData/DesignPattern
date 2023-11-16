package com.cn.InterimTest;

public class Crop {
    private String name;    //  农作物名称
    private double price;   //  价格
    private double number;  //  数量

    public Crop() {
    }

    public Crop(String name, double price, double number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
