package com.cn.prototypePattern.shallowCloning;

public class Email implements Cloneable{
    private Attachment attachment;
    public Email() {
        this.attachment = new Attachment();
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    void display() {
        System.out.println("查看邮件");
    }

    public Attachment getAttachment() {
        return attachment;
    }
}
