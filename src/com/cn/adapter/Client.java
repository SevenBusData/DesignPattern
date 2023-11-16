package com.cn.adapter;

public class Client {
    public static void main(String[] args) {
        Robot robot = (Robot) XMLUtil.getClassName();
        robot.cry();
        robot.move();
    }
}
