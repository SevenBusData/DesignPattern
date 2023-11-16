package com.cn.TVDemo;

/**
 * 简单工厂模式
 */
public class Main {
    public static void main(String[] args) {
        String name = XMLUtil.getBrandName();
        TV tv = TVFactory.produceTV(name);
        tv.play();
    }
}
