package com.cn.responsibilitChain;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("主任" + name + "审批员工" + request.getLeaveName() +
                    "的请假条，请加天数为" + request.getLeaveDays());
        } else {
            if(this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
