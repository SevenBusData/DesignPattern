package com.cn.AbstractedFactory;

public class Cilent {
    public static void main(String[] args) {
        EFactory factory = (EFactory) XMLUtil.getClassName();
        Television television = factory.produceTelevision();
        television.play();
        AirConditioner airConditioner = factory.productAirConditioner();
        airConditioner.changeTemperature();
    }
}
