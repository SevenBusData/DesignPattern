package com.cn.agent;

public class Client {
    public static void main(String[] args) {
        AbstractPermission permission = (AbstractPermission) XMLUtil.getClassName();

        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNOte();
        permission.modifyNote();
        System.out.println("----------------------");
        permission.setLevel(1);
        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNOte();
        permission.modifyNote();
    }
}
