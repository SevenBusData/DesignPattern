package com.cn.InterimTest;

public class Waiter {
    private CropBuilder cropBuilder;

    public void setCropBuilder(CropBuilder cropBuilder) {
        this.cropBuilder = cropBuilder;
    }

    public Crop constructCrop() {
        cropBuilder.buildName();
        cropBuilder.buildPrice();
        cropBuilder.buildNumber();
        return cropBuilder.getCrop();
    }
}
