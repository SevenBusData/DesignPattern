package com.cn.responsibilitChain;

public class LeaveRequest {
    private String LeaveName;
    private int leaveDays;

    public LeaveRequest(String leaveName, int leaveDays) {
        LeaveName = leaveName;
        this.leaveDays = leaveDays;
    }

    public String getLeaveName() {
        return LeaveName;
    }

    public void setLeaveName(String leaveName) {
        LeaveName = leaveName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
