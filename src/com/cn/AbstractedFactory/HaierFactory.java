package com.cn.AbstractedFactory;

public class HaierFactory implements EFactory{

    @Override
    public Television produceTelevision() {
        System.out.println("HaierFactory create HaierTelevision");
        return new HaierTelevision();
    }

    @Override
    public AirConditioner productAirConditioner() {
        System.out.println("HaierFactory create HaierAirCondisioner");
        return new HaierAirCondisioner();
    }
}
