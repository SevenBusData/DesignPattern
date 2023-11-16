package com.cn.InterimTest;

public class SubCropBuilderA extends CropBuilder{
    @Override
    public void buildName() {
        crop.setName("Apple");
    }

    @Override
    public void buildPrice() {
        crop.setPrice(3);
    }

    @Override
    public void buildNumber() {
        crop.setNumber(10);
    }
}
