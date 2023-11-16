package com.cn.dependencyInversion.second;

/**
 * 依赖倒转设值注入
 */
public class Main {
    public static void main(String[] args) {
        AbstractBook book = new ConcreteBook();
        AbstractReader reader = new ConcreteReader();
        ((ConcreteReader) reader).setBook(book);
        reader.read();
    }
}
