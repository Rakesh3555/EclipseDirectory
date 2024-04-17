package com.chainsys.day8;

public class RanGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanAccountGen rgg = new RanAccountGen();
		RanBank generate = new RanBank();
		rgg.getUserInfo(generate);
		rgg.outputGen(generate.getAccountNumber());

	}

}
