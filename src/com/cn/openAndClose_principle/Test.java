package com.cn.openAndClose_principle;

/**
 * 开闭原则
 */
public class Test {
    public static void main(String[] args) {
        LoginForm button = new LoginForm();

        String name = XMLUtil.getBrandName();

        if(name.equals("circle")) {
            CircleButton cButton = new CircleButton();
            button.setButton(cButton);
            button.display();
        } else if (name.equals("rectangle")) {
            RectangleButton rButton = new RectangleButton();
            button.setButton(rButton);
            button.display();
        } else {
            ElseButtton elseButton = new ElseButtton();
            button.setButton(elseButton);
            button.display();
        }
    }
}
