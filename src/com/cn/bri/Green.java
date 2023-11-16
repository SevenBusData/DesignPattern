package com.cn.bri;

public class Green implements Color{
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("用绿色的"+penType+"画"+name);
    }
}
