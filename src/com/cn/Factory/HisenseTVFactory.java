package com.cn.Factory;

public class HisenseTVFactory implements FactoryTV{
    @Override
    public TV productTV() {
        System.out.println("HisenseTVFactory create HisenseTV");
        return new HisenseTV();
    }
}
