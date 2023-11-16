package com.cn.adapter;

public class DogAdapter extends Dog implements Robot{
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
