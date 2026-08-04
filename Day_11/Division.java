package com.companyname.projectname.modulename.mathematics;

public class Division {
	public int num1;
	public int num2;
	
	public Division(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int divide() {
		int result = 0;
		try {
			result = num1 / num2;
		}catch(ArithmeticException arithmeticException){
			
		}
		return result;
	}
}