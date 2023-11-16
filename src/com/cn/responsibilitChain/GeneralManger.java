package com.cn.responsibilitChain;

public class GeneralManger extends Leader {

    public GeneralManger(String name) {
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("总经理" + name + "审批员工" + request.getLeaveName() +
                    "的请假条，请加天数为" + request.getLeaveDays());
        } else {
            System.out.println("莫非" + request.getLeaveName()
                    + "想辞职,居然请假" + request.getLeaveDays() + "天");
        }
    }
}
