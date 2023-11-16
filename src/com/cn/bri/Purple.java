package com.cn.bri;

public class Purple implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("用紫色的"+penType+"画"+name);
    }
}

