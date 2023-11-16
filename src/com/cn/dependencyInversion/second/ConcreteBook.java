package com.cn.dependencyInversion.second;

public class ConcreteBook implements AbstractBook {
    @Override
    public void view() {
        System.out.println("设计模式(第二版)");
    }
}
