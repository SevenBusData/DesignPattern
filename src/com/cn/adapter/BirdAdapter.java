package com.cn.adapter;

public class BirdAdapter extends Bird implements Robot{
    @Override
    public void cry() {
        System.out.println("Robot imitate:");
        super.cry();
    }

    @Override
    public void move() {
        System.out.println("Robot imitate:");
        super.move();
    }
}
