package com.cn.NvWaCreatePerson;

/**
 * 简单工厂模式
 */
public class Main {
    public static void main(String[] args) {
        String gender = XMLUtil.getGender();
        NvWa nvWa = CreatePersonFactory.createPerson(gender);
        nvWa.CreatePerson();
    }
}
