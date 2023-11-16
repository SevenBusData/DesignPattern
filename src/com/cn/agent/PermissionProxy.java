package com.cn.agent;

public class PermissionProxy implements AbstractPermission{
    private RealPermission permission = new RealPermission();
    private int level = 0;
    @Override
    public void modifyUserInfo() {
        if (0 == level) {
            System.out.println("对不起，你没有权限!");
        } else if (1 == level) {
            permission.modifyUserInfo();
        }
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子");
    }

    @Override
    public void publishNOte() {
        if (0 == level) {
            System.out.println("对不起，你没有权限!");
        } else if (1 == level) {
            permission.publishNOte();
        }
    }

    @Override
    public void modifyNote() {
        if (0 == level) {
            System.out.println("对不起，你没有权限!");
        } else if (1 == level) {
            permission.modifyNote();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
