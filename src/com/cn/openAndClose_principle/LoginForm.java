package com.cn.openAndClose_principle;

public class LoginForm {
    private AbstractedLoginForm button;

    public AbstractedLoginForm getButton() {
        return button;
    }

    public void setButton(AbstractedLoginForm button) {
        this.button = button;
    }

    public void display() {
        button.display();
    }
}
