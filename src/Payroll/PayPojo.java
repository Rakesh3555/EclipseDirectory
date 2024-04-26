package Payroll;

public class PayPojo {
	int payHour;
	int totalHrWorked;
	int overTime;
	int totalOrTime;
	double dedection;
	double pF;
	double insurance;
	double allowance;
	public double getpF() {
		return pF;
	}
	public void setpF(double pF) {
		this.pF = pF;
	}
	public double getInsurance() {
		return insurance;
	}
	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double getDedection() {
		return dedection;
	}
	public void setDedection(double dedection) {
		this.dedection = dedection;
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

}