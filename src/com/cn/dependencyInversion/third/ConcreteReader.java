package com.cn.dependencyInversion.third;


public class ConcreteReader implements AbstractReader {

    @Override
    public void read(AbstractBook book) {
        book.view();
    }
}
