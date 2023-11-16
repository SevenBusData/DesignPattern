package com.cn.interfaceIsolation;

public class ClientB implements AbstractServiceB{

    @Override
    public void operatorB() {
        System.out.println("operatorB...");
    }
}
