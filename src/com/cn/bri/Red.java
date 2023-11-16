package com.cn.bri;

public class Red implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("用红色的"+penType+"画"+name);
    }
}
