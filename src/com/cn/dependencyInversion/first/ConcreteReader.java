package com.cn.dependencyInversion.first;

public class ConcreteReader implements AbstractReader{
    private AbstractBook book;

    public ConcreteReader(AbstractBook book) {
        this.book = book;
    }

    @Override
    public void read() {
        book.view();
    }
}
