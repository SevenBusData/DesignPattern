package com.cn.Factory;

/**
 * 工厂方法模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        FactoryTV factoryTV = (FactoryTV) XMLUtil.getClassName();
        TV tv = factoryTV.productTV();
        tv.play();
    }
}
