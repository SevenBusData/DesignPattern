package com.cn.InterimTest;

public class SubCropBuilderB extends CropBuilder{
    @Override
    public void buildName() {
        crop.setName("Banana");
    }

    @Override
    public void buildPrice() {
        crop.setPrice(2);
    }

    @Override
    public void buildNumber() {
        crop.setNumber(8);
    }
}
