package com.cn.signal;

public class EagerSignalTon {
    private static final EagerSignalTon instance = new EagerSignalTon();

    private EagerSignalTon() {
    }

    public static EagerSignalTon getInstance() {
        return instance;
    }
}
