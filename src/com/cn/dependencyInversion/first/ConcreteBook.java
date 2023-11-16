package com.cn.dependencyInversion.first;

public class ConcreteBook implements AbstractBook{
    @Override
    public void view() {
        System.out.println("设计模式(第二版)");
    }
}
