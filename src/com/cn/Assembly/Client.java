package com.cn.Assembly;

public class Client {
    public static void main(String[] args) {
        MyElement ob1, ob2, ob3, ob4, ob5;
        Plate plate1, plate2, plate3;

        ob1 = new Apple();
        ob2 = new Pear();
        plate1 = new Plate();
        plate1.add(ob1);
        plate1.add(ob2);


        ob3 = new Banana();
        ob4 = new Banana();
        plate2 = new Plate();
        plate2.add(ob3);
        plate2.add(ob4);


        ob5 = new Apple();
        plate3 = new Plate();
        plate3.add(plate1);
        plate3.add(plate2);
        plate3.add(ob5);


        plate3.eat();
    }
}
