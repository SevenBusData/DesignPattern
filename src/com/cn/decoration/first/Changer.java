package com.cn.decoration.first;

public class Changer {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    public void move() {
        transform.move();
    }
}
