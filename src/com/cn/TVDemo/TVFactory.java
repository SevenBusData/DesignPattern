package com.cn.TVDemo;

public class TVFactory {
    public static TV produceTV(String brand) {
        if(brand.equalsIgnoreCase("Haier")) {
            return new HaierTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            return new HisenseTV();
        } else {
            System.out.println("没有产生电视！");
        }
        return null;
    }
}
