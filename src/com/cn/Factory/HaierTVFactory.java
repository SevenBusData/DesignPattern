package com.cn.Factory;

public class HaierTVFactory implements FactoryTV{
    @Override
    public TV productTV() {
        System.out.println("HaierTVFactory create HaierTV");
        return new HaierTV();
    }
}
