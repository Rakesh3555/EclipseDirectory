package com.chainsys.day7;




public class GRbank {

	public static void main(String[] args) {

		GRdeposit gr=new GRdeposit();
		gr.getUserInfo();
		gr.printInput();
		gr.deposit(1000);
		gr.deposit("GR000069","12345678");
	}
}