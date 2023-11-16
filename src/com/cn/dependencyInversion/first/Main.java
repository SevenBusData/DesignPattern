package com.cn.dependencyInversion.first;

/**
 * 依赖倒转构造注入
 */
public class Main {
    public static void main(String[] args) {
        AbstractBook book = new ConcreteBook();
        AbstractReader reader = new ConcreteReader(book);
        reader.read();
    }
}
