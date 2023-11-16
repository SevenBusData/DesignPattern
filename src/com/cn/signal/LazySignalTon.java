package com.cn.signal;

public class LazySignalTon {
    private static LazySignalTon instance = null;
    private LazySignalTon() {

    }

    public static LazySignalTon getInstance() {
        if (instance == null) {
            synchronized (LazySignalTon.class) {
                instance = new LazySignalTon();
            }
        }
        return instance;
    }
}
