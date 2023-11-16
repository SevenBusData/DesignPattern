package com.cn.interfaceIsolation;

public class ConcreteService implements AbstractServiceA, AbstractServiceB, AbstractServiceC{

    @Override
    public void operatorA() {
        System.out.println("operatorA...");
    }

    @Override
    public void operatorB() {
        System.out.println("operatorB...");
    }

    @Override
    public void operatorC() {
        System.out.println("operatorC...");
    }
}
