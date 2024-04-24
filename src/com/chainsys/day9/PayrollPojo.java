package com.chainsys.day9;

public class PayrollPojo {
	String employeeName;
	int payHour;
	int totalHrWorked;
	int overTime;
	int totalOrTime;
	float grossPay;
	float netPay;
	public float getNetPay() {
		return netPay;
	}
	public void setNetPay(float netPay) {
		this.netPay = netPay;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getPayHour() {
		return payHour;
	}
	public void setPayHour(int payHour) {
		this.payHour = payHour;
	}
	public int getTotalHrWorked() {
		return totalHrWorked;
	}
	public void setTotalHrWorked(int totalHrWorked) {
		this.totalHrWorked = totalHrWorked;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public int getTotalOrTime() {
		return totalOrTime;
	}
	public void setTotalOrTime(int totalOrTime) {
		this.totalOrTime = totalOrTime;
	}
	public float getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(float grossPay) {
		this.grossPay = grossPay;
	}
	

}
