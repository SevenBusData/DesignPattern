package com.cn.bri;

public class Main {
    public static void main(String[] args) {
        Color color = (Color) XMLUtilPen.getBean("color");
        Pen pen = (Pen) XMLUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("鲜花");

    }
}
