package com.cn.InterimTest;

public class Client {
    public static void main(String[] args) {
        CropBuilder cropBuilder = (CropBuilder) XMLUtil.getClassName();

        Waiter waiter = new Waiter();
        waiter.setCropBuilder(cropBuilder);

        Crop crop = waiter.constructCrop();

        System.out.println("账单");
        System.out.println("购买的农作物名称" + crop.getName());
        System.out.println(crop.getName() + "农作物价格为" + crop.getPrice());
        System.out.println(crop.getName() + "农作物购买的数量" + crop.getNumber());
    }
}
