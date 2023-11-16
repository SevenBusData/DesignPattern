package com.cn.NvWaCreatePerson;

public class CreatePersonFactory {
    public static NvWa createPerson(String gender) {
        if (gender.equalsIgnoreCase("Man")) {
            return new Man();
        } else if (gender.equalsIgnoreCase("Women")) {
            return new Women();
        } else {
            System.out.println("传参错误!");
        }
        return null;
    }
}
