package com.cn.decoration.first;

public class Airplane extends Changer{
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("变成飞机");
    }

    public void fly() {
        System.out.println("在天上飞翔");
    }
}
