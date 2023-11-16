package com.cn.bri;

public class Blue implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("用蓝色的"+penType+"画"+name);
    }
}

