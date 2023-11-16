package com.cn.bri;

public class SmallPen extends Pen{
    @Override
    void draw(String name) {
        color.bePaint("小号笔",name);
    }
}
