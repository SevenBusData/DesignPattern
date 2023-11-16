package com.cn.prototypePattern.deepCloning;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Email email = new Email();
        Email copyEmail = (Email) email.deepClone();


        //  深克隆 克隆对象和原对象不是同一个对象
        System.out.println("email == copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment() == copyEmail.getAttachment()?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
