package com.cn.AbstractedFactory;

public class TCLAirConditioner implements AirConditioner{
    @Override
    public void changeTemperature() {
        System.out.println("TCLAirConditioner is changeTemperature");
    }
}
