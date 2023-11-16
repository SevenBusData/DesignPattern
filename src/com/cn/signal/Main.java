package com.cn.signal;

public class Main {
    public static void main(String[] args) {
        EagerSignalTon eagerSignalTon1 = EagerSignalTon.getInstance();
        EagerSignalTon eagerSignalTon2 = EagerSignalTon.getInstance();

        LazySignalTon lazySignalTon1 = LazySignalTon.getInstance();
        LazySignalTon lazySignalTon2 = LazySignalTon.getInstance();

        System.out.println(eagerSignalTon1);
        System.out.println(eagerSignalTon2);

        System.out.println("---------");
        System.out.println(lazySignalTon1);
        System.out.println(lazySignalTon2);
    }
}
