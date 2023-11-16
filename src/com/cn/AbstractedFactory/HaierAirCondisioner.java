package com.cn.AbstractedFactory;

public class HaierAirCondisioner implements AirConditioner{
    @Override
    public void changeTemperature() {
        System.out.println("HaierAirCondisioner is changeTemperature");
    }
}
