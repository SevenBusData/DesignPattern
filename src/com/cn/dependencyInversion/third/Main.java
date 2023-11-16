package com.cn.dependencyInversion.third;

/**
 * 依赖倒转接口注入
 */
public class Main {
    public static void main(String[] args) {
        AbstractBook book = new ConcreteBook();
        AbstractReader reader = new ConcreteReader();
        reader.read(book);
    }
}
