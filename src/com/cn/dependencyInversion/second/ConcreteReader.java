package com.cn.dependencyInversion.second;

public class ConcreteReader implements AbstractReader {
    private AbstractBook book;

    public void setBook(AbstractBook book) {
        this.book = book;
    }
    @Override
    public void read() {
        book.view();
    }
}
