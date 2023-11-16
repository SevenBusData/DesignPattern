package com.cn.interfaceIsolation;

/**
 * 接口隔离原则
 */
public class Main {
    public static void main(String[] args) {
        ConcreteService service = new ConcreteService();
        service.operatorA();
        service.operatorB();
        service.operatorC();

        System.out.println("------------------------");

        ClientA clientA = new ClientA();
        clientA.operatorA();

        System.out.println("------------------------");

        ClientB clientB = new ClientB();
        clientB.operatorB();

        System.out.println("------------------------");

        ClientC clientC = new ClientC();
        clientC.operatorC();
    }
}
