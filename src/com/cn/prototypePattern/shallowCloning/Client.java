package com.cn.prototypePattern.shallowCloning;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Email email = new Email();
        Email copyEmail = (Email) email.clone();

        //  浅克隆 引用类型成员变量 不复制
        System.out.println("email == copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment() == copyEmail.getAttachment()?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
