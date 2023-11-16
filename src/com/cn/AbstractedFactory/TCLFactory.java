package com.cn.AbstractedFactory;

public class TCLFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        System.out.println("TCLFactory create TCLTelevision");
        return new TCLTelevision();
    }

    @Override
    public AirConditioner productAirConditioner() {
        System.out.println("TCLFactory create TCLAirConditioner");
        return new TCLAirConditioner();
    }
}
