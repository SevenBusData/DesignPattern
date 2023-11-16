package com.cn.interfaceIsolation;

public class ClientC implements AbstractServiceC{

    @Override
    public void operatorC() {
        System.out.println("operatorC...");
    }
}
