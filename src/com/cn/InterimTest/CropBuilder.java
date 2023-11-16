package com.cn.InterimTest;

public abstract class CropBuilder {
    protected Crop crop = new Crop();

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public abstract void buildName();

    public abstract void buildPrice();
    public abstract void buildNumber();
}
