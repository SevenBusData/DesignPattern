package com.cn.decoration.first;

public class Client {
    public static void main(String[] args) {
        Transform camaro;
        camaro = new Car();
        camaro.move();
        System.out.println("------------------------");
        Robot bumblebee1 = new Robot(camaro);
        bumblebee1.move();
        bumblebee1.say();
        System.out.println("------------------------");
        Airplane bumblebee2 = new Airplane(camaro);
        bumblebee2.move();
        bumblebee2.fly();
    }
}
